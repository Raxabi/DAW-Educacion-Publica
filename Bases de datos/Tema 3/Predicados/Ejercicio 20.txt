/*
 Ejercicio 20
 Muestra los datos de las personas cuyo nombre
 empieza por Ant o Lui y aparece despues
 una a en cualquier posicion
*/

SELECT NOMBRE
FROM CLIENTES
WHERE NOMBRE SIMILAR TO '(Ant|Lui)%s_a';