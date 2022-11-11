/* 4. Muestra las filas a partir de la fila 3 de los autores distintos en libros. Hazlo de dos formas
distintas */


select skip 2  distinct ( autores) 
from LIBROS;

select distinct  autores 
from LIBROS
rows 3 to 6 ;
