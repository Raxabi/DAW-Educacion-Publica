/*
 Ejercicio 7
 Muestra las 5 primeras filas de id:libro, precio y valoracion
 valoracion "buena" si precio >= 8 y "mala" si generaciones es <8
*/

SELECT FIRST 5 ID_LIBRO, PRECIO,
CASE
 WHEN PRECIO >= 8 THEN 'Buena'
 WHEN PRECIO < 8 THEN 'Mala'
END AS Valoracion
FROM LIBROS, RDB$DATABASE;