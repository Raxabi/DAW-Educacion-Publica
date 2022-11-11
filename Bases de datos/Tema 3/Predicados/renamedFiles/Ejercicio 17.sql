/*
 Ejercicio 17
 Muestra los datos de las librerias donde la poblacion empieza por A o M (usar expresiones regualres)
 ordenando la salida por nombre en orde ascendente y fecha_baja en orden ascendente mostrando primero
 los nulos
*/

SELECT *
FROM LIBRERIAS
WHERE POBLACION SIMILAR TO '(A|M)%';