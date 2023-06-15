SELECT * FROM creador;

SELECT * FROM personajes;
INSERT INTO personajes 
(id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values 
(1,'Bruce Banner','Hulk',160,'600 mil',75,98,1962,'Fisico Nuclear',1),
(2,'Tony Stark','Iron Man',170,'200 mil',70,123,1963,'Inventor Industrial',1),
(3,'Thor Odinson','Thor',145,'infinita',100,235,1962,'Rey de Asgard',1),
(4,'Wanda Maximof','Bruja Escarlata',170,'100 mil',90,345,1964,'Bruja',1),
(5,'Carol Danvers','Capitana Marvel',157,'250 mil',85,128,1968,'Oficial de inteligencia',1),
(6,'Thanos','Thanos',170,'infinita',40,306,1973,'Adorador de la muerte',1),
(7,'Peter Parker','Spiderman',165,'25 mil',80,74,1962,'Fotografo',1),
(8,'Steve Rogers','Capitan America',145,'600',45,60,1941,'Oficial federal',1),
(9,'Bobby Drake','Ice Man',140,'2 mil',64,122,1963,'Contador',1),
(10,'Barry Alenn','Flash',160,'10 mil',120,168,1956,'Cientifico Forence',2),
(11,'Bruce Wayne','Batman',170,'500',32,47,1939,'Hombre de negocios',2),
(12,'Clarck Kent','Superman',165,'infinita',120,182,1948,'Reportero',2),
(13,'Diana Prince','Mujer Maravilla',160,'infinita',95,127,1949,'Princesa guerrera',2);

SELECT * FROM personajes;

UPDATE personajes
SET aparicion = 1938
WHERE id_personaje = 12;

SELECT * FROM personajes;

SELECT nombre_real from personajes;

SELECT nombre_real from personajes WHERE nombre_real LIKE 's%';

SELECT nombre_real, personaje, inteligencia from personajes Order by inteligencia asc;



