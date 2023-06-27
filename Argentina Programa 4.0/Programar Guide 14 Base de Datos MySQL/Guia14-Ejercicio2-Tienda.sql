/*1. Lista el nombre de todos los productos que hay en la tabla producto.*/
SELECT nombre FROM producto;

/*2. Lista los nombres y los precios de todos los productos de la tabla producto.*/
SELECT nombre, precio FROM producto;

/*3. Lista todas las columnas de la tabla producto.*/
SELECT * FROM producto;

/*4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando
el valor del precio.*/
SELECT nombre, round(precio,2) from producto;

/*5. Lista el código de los fabricantes que tienen productos en la tabla producto.*/
SELECT * FROM fabricante WHERE codigo in (SELECT codigo_fabricante FROM producto);
SELECT distinct p.codigo_fabricante, f.nombre FROM fabricante f, producto p WHERE f.codigo=p.codigo_fabricante;

/*6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar
los repetidos.*/
SELECT distinct codigo_fabricante FROM producto;

/*7. Lista los nombres de los fabricantes ordenados de forma ascendente.*/
SELECT nombre FROM fabricante ORDER BY nombre;

/*8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
ascendente y en segundo lugar por el precio de forma descendente.*/
SELECT nombre, precio
FROM producto
ORDER BY nombre ASC, precio DESC;

/*9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.*/
SELECT * FROM fabricante limit 5;

/*10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas
ORDER BY y LIMIT)*/
SELECT nombre, precio FROM producto ORDER BY precio limit 1;
SELECT min(precio) from producto;

/*11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER
BY y LIMIT)*/
SELECT nombre, precio FROM producto ORDER BY precio desc limit 1;

/*12. Lista el nombre de los productos que tienen un precio menor o igual a $120.*/
SELECT nombre, precio from producto where precio <= 120;

/*13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador
BETWEEN.*/
SELECT * FROM producto WHERE precio BETWEEN 60 and 200;

/*14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador
IN.*/
SELECT * FROM producto WHERE codigo_fabricante in (1,3,5);

/*15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil
en el nombre.*/
SELECT nombre FROM producto WHERE nombre like '%Portátil%';

/*Consultas Multitabla
1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante
y nombre del fabricante, de todos los productos de la base de datos.*/
SELECT p.codigo, p.nombre, f.codigo, f.nombre FROM producto p, fabricante f WHERE f.codigo=p.codigo_fabricante;

SELECT * from producto left join fabricante on producto.codigo = fabricante.codigo;

/*2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
orden alfabético.*/
SELECT * from producto left join fabricante on producto.codigo = fabricante.codigo ORDER BY fabricante.nombre;

/*3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
más barato.*/
SELECT * FROM producto p left join fabricante f on p.codigo = f.codigo ORDER BY p.precio limit 1;

/*4. Devuelve una lista de todos los productos del fabricante Lenovo.*/
SELECT * FROM fabricante f left join producto p on p.codigo_fabricante = f.codigo WHERE f.nombre = 'Lenovo';

/*5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
mayor que $200.*/
SELECT * from producto p left join fabricante f on p.codigo = f.codigo where f.nombre = 'Crucial' and p.precio >200;

/*6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
Utilizando el operador IN.*/
SELECT * from producto p left join fabricante f on p.codigo_fabricante = f.codigo WHERE f.nombre in ('Asus','Hewlett-Packard');

/*7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
ascendente)*/
SELECT p.nombre, p.precio, f.nombre 
FROM producto p left join fabricante f 
on p.codigo_fabricante = f.codigo 
WHERE p.precio >= 180 
ORDER BY p.precio desc, p.nombre asc;

/*Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
8.1) Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
fabricantes que no tienen productos asociados.*/
SELECT * from fabricante left join producto on producto.codigo_fabricante = fabricante.codigo;
/*2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
producto asociado.*/
SELECT * from producto right join fabricante on producto.codigo_fabricante = fabricante.codigo where producto.codigo_fabricante is null;
/*------------Subconsultas (En la cláusula WHERE)-----------------*/
/*Con operadores básicos de comparación
9).1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).*/
SELECT * from producto, fabricante where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre like '%Lenovo%';

/*2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto
más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).*/
SELECT p.nombre, f.nombre, p.precio FROM producto p, fabricante f 
WHERE f.codigo = p.codigo_fabricante 
AND p.precio = (SELECT MAX(p.precio) FROM producto p, fabricante f WHERE f.codigo = p.codigo_fabricante AND f.nombre = 'lenovo');

/*3. Lista el nombre del producto más caro del fabricante Lenovo.*/
SELECT * from producto, fabricante 
where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre 
like '%Lenovo%' order by fabricante.nombre desc limit  1;

/*4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio
medio de todos sus productos.*/
SELECT p.nombre, f.nombre, p.precio FROM producto p, fabricante f WHERE f.codigo = p.codigo_fabricante 
AND p.precio > (SELECT avg(p.precio) FROM producto p, fabricante f WHERE f.codigo = p.codigo_fabricante AND f.nombre = 'asus')
and f.nombre = 'asus';

SELECT p.nombre, f.nombre, p.precio FROM producto p, fabricante f
WHERE f.codigo = p.codigo_fabricante AND f.nombre = 'Asus'AND p.precio > (SELECT AVG(p2.precio) 
FROM producto p2, fabricante f2 WHERE f2.codigo = p2.codigo_fabricante AND f2.nombre = 'Asus');

/*Subconsultas con IN y NOT IN
1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o
NOT IN).SELECT * FROM Alumnos WHERE nombre IN (“Agustín, “Mariela”, “Juliana”););*/
select codigo, nombre from fabricante f where codigo in (select codigo_fabricante from producto);

/*2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando
IN o NOT IN).*/
select codigo, nombre from fabricante where codigo not in(select codigo_fabricante from producto);

/*Subconsultas (En la cláusula HAVING)
1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
de productos que el fabricante Lenovo.*/
select codigo_fabricante, count(*)  from producto group by codigo_fabricante having count(*) = 
(select count(*) from producto where codigo_fabricante = (select codigo from fabricante where nombre = 'lenovo'));

select p.codigo_fabricante, f.nombre, count(*)  from producto p, fabricante f where p.codigo_fabricante = f.codigo  group by p.codigo_fabricante having count(*) = 
(select count(*) from producto where codigo_fabricante = (select codigo from fabricante where nombre = 'lenovo'));

