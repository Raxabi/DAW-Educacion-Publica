-- Ejercicio 3
-- Muetra de la fila 2 a la 4 de las poblaciones
-- distintas en librerias
-- Hazlo de 2 formas distintas

SELECT DISTINCT POBLACION
FROM LIBRERIAS
ROWS 2 TO 4;

SELECT FIRST 3 SKIP 1 DISTINCT POBLACION
FROM LIBRERIAS;