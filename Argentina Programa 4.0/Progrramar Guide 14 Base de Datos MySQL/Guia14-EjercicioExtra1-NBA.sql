/* 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.*/
SELECT nombre FROM jugadores ORDER BY nombre;

/*2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.*/
SELECT nombre, posicion, peso FROM jugadores where posicion like '%C%' AND peso > 200 ORDER by nombre;

/*3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.*/
SELECT nombre FROM equipos ORDER BY nombre;

/*4. Mostrar el nombre de los equipos del este (East).*/
SELECT nombre, conferencia FROM equipos WHERE conferencia like '%East%';

/*5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.*/
SELECT nombre, ciudad FROM equipos WHERE ciudad like 'C%' ORDER BY nombre;

/*6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.*/
SELECT * FROM equipos e, jugadores j WHERE e.nombre = j.nombre_equipo ORDER BY j.nombre_equipo;

/*7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.*/
SELECT * FROM equipos e, jugadores j WHERE e.nombre = j.Nombre_equipo AND j.Nombre_equipo like '%raptors%' ORDER BY j.Nombre;

/*8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.*/
SELECT Nombre, jugador, Puntos_por_partido FROM estadisticas e INNER JOIN Jugadores j ON e.jugador = j.codigo  WHERE jugador = (SELECT codigo FROM jugadores WHERE nombre like '%Pau Gasol%');

/*9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.*/
SELECT Puntos_por_partido, jugador, temporada FROM estadisticas e 
INNER JOIN jugadores j on e.jugador = j.codigo WHERE jugador = (SELECT codigo FROM jugadores WHERE nombre like '%Pau Gasol%') and temporada = '04/05';

/*10. Mostrar el número de puntos de cada jugador en toda su carrera.*/
SELECT round(sum(Puntos_por_partido), 2) PuntoxPartido, jugador FROM estadisticas GROUP by jugador;

/*11. Mostrar el número de jugadores de cada equipo.*/
SELECT nombre_equipo, COUNT(*) FROM jugadores GROUP BY Nombre_equipo;

/*12. Mostrar el jugador que más puntos ha realizado en toda su carrera.*/
SELECT nombre, round(sum(Puntos_por_partido), 2) PuntoxPartido, jugador 
FROM estadisticas e, jugadores j 
WHERE e.jugador = j.codigo GROUP by jugador 
ORDER BY round(sum(Puntos_por_partido), 2) desc limit 1;

/*13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.*/
SELECT nombre, conferencia, division
FROM equipos
WHERE nombre = (SELECT nombre_equipo FROM jugadores WHERE altura = (SELECT max(altura) FROM jugadores));

/*14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.*/
SELECT round(avg(e.puntos_por_partido),2), j.nombre_equipo
FROM estadisticas e, jugadores j
WHERE j.codigo = e.jugador
AND j.nombre_equipo 
in (
	select nombre
	from equipos
	where division = 'Pacific'
)
GROUP BY j.nombre_equipo;

/*15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.*/
SELECT *, abs(max(puntos_local - puntos_visitante)) as diferencia
FROM partidos
GROUP BY codigo
ORDER BY diferencia desc
limit 5;
;

/*16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.*/
SELECT e.nombre, sum(p.puntos_local) as local_total, sum(p.puntos_visitante) as visitante_total
FROM partidos p, equipos e
WHERE p.equipo_local = e.nombre or p.equipo_visitante = e.nombre
GROUP BY e.nombre;

/*17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.*/
SELECT e.*, sum(p.puntos_local) as local_total, sum(p.puntos_visitante) as visitante_total
FROM partidos p
JOIN equipos e on p.equipo_local = e.nombre or p.equipo_visitante = e.nombre
GROUP BY e.nombre;

select resumen_local.equipo,puntos_local,puntos_visitante,puntos_local+puntos_visitante puntos_total from
(select equipo,sum(puntos) puntos_local from
(select equipo_local equipo,puntos_local puntos,true es_local from partidos) partidos_local
group by equipo) resumen_local,
(select equipo,sum(puntos) puntos_visitante from
(select equipo_visitante equipo,puntos_visitante puntos,true es_local from partidos) partidos_visitante
group by equipo) resumen_visitante
where resumen_local.equipo = resumen_visitante.equipo;


select resumen_local.equipo,puntos_local,puntos_visitante,puntos_local+puntos_visitante puntos_total from
(select equipo_local equipo,sum(puntos_local) puntos_local from partidos
group by equipo) resumen_local,
(select equipo_visitante equipo,sum(puntos_visitante) puntos_visitante from partidos
group by equipo) resumen_visitante
where resumen_local.equipo = resumen_visitante.equipo;

/*18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null.*/
select *,   if (puntos_visitante > puntos_local, equipo_visitante,  -- if
			if (puntos_visitante < puntos_local, equipo_local, 		-- else if
			null)) 													-- else
as equipo_ganador
from partidos;

select *,
	case																-- switch
		when puntos_local > puntos_visitante then equipo_local			-- case1, then (es la funcion)
		when puntos_local < puntos_visitante then equipo_visitante 		-- case2, then (es la funcion)
        else null														-- else = default 
	end																	-- llave de cierre de switch // break
	as equipo_ganador
	from partidos;


