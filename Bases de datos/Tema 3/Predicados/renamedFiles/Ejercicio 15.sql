/*
 Ejercicio 15
 Muestra los datos de las clientes cuya poblacion contenga (Málaga)
 que tienen entre 18 y 35 años.
*/

SELECT *
FROM CLIENTES
WHERE POBLACION = 'Malaga' AND DATEDIFF(YEAR, FECHA_NAC, CURRENT_DATE) = 18 OR 35;