/*
 Ejercicio 9
 Muestra los datos de todos los libros ordenados
 por titulo apareciendo primero los que tengan valor null en precio
*/

SELECT *
FROM LIBROS
ORDER BY PRECIO = NULL ASC;