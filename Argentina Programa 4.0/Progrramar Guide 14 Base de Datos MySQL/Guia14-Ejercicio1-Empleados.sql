SELECT * FROM empleados;
-----------------------------------------------------------
SELECT * FROM departamentos;
-----------------------------------------------------------
SELECT nombre_depto from departamentos;
-----------------------------------------------------------
SELECT nombre, sal_emp FROM empleados;
-----------------------------------------------------------
SELECT sal_emp FROM empleados;
-----------------------------------------------------------
SELECT * FROM empleados 
WHERE cargo_emp = "Secretaria";
-----------------------------------------------------------
SELECT * FROM empleados 
WHERE cargo_emp = "Vendedor" 
ORDER BY nombre asc;
-----------------------------------------------------------
SELECT nombre, cargo_emp, sal_emp 
FROM empleados 
WHERE sal_emp 
ORDER BY sal_emp asc;
-----------------------------------------------------------
SELECT nombre_jefe_depto, nombre_depto 
FROM departamentos 
WHERE ciudad = "CIUDAD REAL";
-----------------------------------------------------------
SELECT nombre AS Nombre, cargo_emp AS Cargo 
FROM empleados;
-----------------------------------------------------------
SELECT id_depto, nombre, sal_emp, comision_emp, id_depto 
FROM empleados 
WHERE id_depto = 2000 order by comision_emp desc;
-----------------------------------------------------------
SELECT id_depto, nombre,  (sal_emp + comision_emp + 500) 
FROM empleados 
WHERE id_depto = 3000 order by nombre asc;
-----------------------------------------------------------
SELECT * FROM empleados WHERE nombre LIKE 'J%';
-----------------------------------------------------------
SELECT sal_emp, comision_emp, nombre, (sal_emp + comision_emp) 
AS TOTAL FROM empleados 
WHERE comision_emp > 1000;
-----------------------------------------------------------
SELECT sal_emp, comision_emp, nombre, (sal_emp + comision_emp) 
AS TOTAL FROM empleados 
WHERE comision_emp = 0;
-----------------------------------------------------------
SELECT * FROM empleados 
WHERE comision_emp <= sal_emp * 0.3;
-----------------------------------------------------------
SELECT *
FROM empleados
WHERE nombre NOT LIKE '%MA%';
-----------------------------------------------------------
SELECT nombre_depto
FROM departamentos
WHERE nombre_depto 
IN ('Ventas', 'Investigación', 'Mantenimiento');
-----------------------------------------------------------
SELECT nombre_depto
FROM departamentos
WHERE nombre_depto 
NOT IN ('Ventas', 'Investigación', 'Mantenimiento');
----------------------------------------------------------
SELECT MAX(sal_emp) AS salario_maximo
FROM empleados;
----------------------------------------------------------
SELECT nombre
FROM empleados
ORDER BY nombre DESC
LIMIT 1;
----------------------------------------------------------
SELECT MAX(sal_emp) AS salario_maximo, 
MIN(sal_emp) AS salario_minimo, 
MAX(sal_emp) - MIN(sal_emp) AS diferencia_salarios
FROM empleados;
----------------------------------------------------------
SELECT AVG(sal_emp) AS salario_promedio
FROM empleados
GROUP BY id_depto;
----------------------------------------------------------
SELECT id_depto, COUNT(*) AS numero_empleados
FROM empleados
GROUP BY id_depto
HAVING COUNT(*) > 3;
----------------------------------------------------------
SELECT id_depto, COUNT(*) AS numero_empleados
FROM empleados
GROUP BY id_depto
HAVING COUNT(*) = 0;
----------------------------------------------------------
SELECT * FROM empleados 
LEFT JOIN departamentos 
ON empleados.id_depto = departamentos.id_depto;
----------------------------------------------------------

SELECT * FROM empleados 
JOIN departamentos ON id_depto = id_depto 
WHERE sal_emp >= (AVG(sal_emp)) 
ORDER BY id_depto;
----------------------------------------------------------
SELECT nombre, sal_emp 
FROM empleados 
WHERE sal_emp >= (SELECT AVG(sal_emp) FROM empleados);



