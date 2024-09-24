La siguiente tabla define los códigos de respuesta retornados por el microservicio en caso de error. 

|Código|Código Http|Descripción Http|Mensaje|Detalle|Acciones|
|----|----|----|----|----|----|
|ERR_01|400|Bad Request|Exception message example|Generic error in the request.|The request cannot be fulfilled due to bad syntax, the consumer needs to check the message request.|
|ERR_02|401|No autorizado|Exception message example 2|The petition received by the service does not include some required parameter.|It can retry the request but it is necessary that the consumer checks the mandatory parameters in the schema.|


Para detallar los respectivos errores con excepciones tenga en cuenta los códigos de excepciones de servicio y de políticas de API definidos por la OMA (Open Mobile Alliance). Utilice este tipo de excepciones para definir de una manera más detallada y acertada los errores que podría devolver la API en la que trabaja, agregue a la respuesta de la API los códigos que considere darían valor. Para ver todos los códigos de excepción visite el sitio https://www.openmobilealliance.org/wp

A continuación, se muestran algunos ejemplos del uso de esta especificación:

1. Error de validación de campos mandatorios

> 	Excepción: 1001: Missing Mandatory Parameters
> 	
> 	Code: 1001
> 	
> 	Message: Missing Mandatory Parameters	
> 		
> 	HTTP status code: 400 Bad request

Ejemplo implementación JSON

```
{
"respuestaServicio": {},
"codigoError": "MSEN_01",
"tipoError": "TECNICO|FUNCIONAL",
"mensaje": "Failed to generate key pair",
"fechaProceso": "2023-05-29T23:42:04z",
"causas": [
	{
		"codigoCauda": "1001",
		"descripcionCauda": "subscribe-detail-api"
	}
]
}
```

2. Token inválido

> Excepción: 3000: Generic Security Error
> 
> Code: 3000
> 
> Message:  Generic Security Error		
> 
> HTTP status code: 401 Unauthorized

Ejemplo implementación JSON

```
{
"respuestaServicio": {},
"codigoError": "MSEN_01",
"tipoError": "TECNICO|FUNCIONAL",
"mensaje": "Failed to generate key pair",
"fechaProceso": "2023-05-29T23:42:04z",
"causas": [
	{
		"codigoCauda": "1001",
		"descripcionCauda": "subscribe-detail-api"
	}
]
}
```