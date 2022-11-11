/*
 Mostrar las 4 primeras filas de nombre y dirección
 de los clientes para clientes con telefono,
 la dirección empieza por vocal y tiene alguna cifra numérica
 y el poblacion empieza por ‘V.’ o ‘VVva’
 y acaba en vocal ordenando la salida por el nombre.
*/

SELECT FIRST 4 *
FROM CLIENTES
WHERE CLIENTES.TELEFONO IS NOT NULL AND CLIENTES.DIRECCION SIMILAR TO 'V.|VVaa%a|A|e|E|i|I|o|O|u|U'
ORDER BY CLIENTES.NOMBRE ASC;