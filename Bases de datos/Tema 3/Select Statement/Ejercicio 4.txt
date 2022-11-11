/*
 Ejercicio 4
 Muestra las filas a partir de la fila 3
 de los autores distintos en libros.
 Hazlo de 2 formas distintas
*/

SELECT FIRST 3 DISTINCT AUTOR
FROM LIBROS;

SELECT DISTINCT AUTOR
FROM LIBROS
ROWS 3;