/*
 Ejecicio 16
 Muestra el nombre del clientes, su direccion, su fecha de nacimiento,
 la fecha en la que cumplio 18 años y los años que tienen en la actualidad,
 para los clientes mayores de edad ordenando la salida por vejez (primero el mas joven).
*/

SELECT
NOMBRE,
DIRECCION,
FECHA_NAC,
DATEDIFF(YEAR, FECHA_NAC, CURRENT_DATE) AS ACTUAL_YEAR
FROM CLIENTES;