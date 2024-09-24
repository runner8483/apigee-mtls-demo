Los siguientes son los errores más comunes de acuerdo con el estándar RFC7231:

|Código|Mensaje|Detalle|
|----|----|----|
|200|OK|La operación fue exitosa|
|201|Creado|La operación se realizó correctamente y la solicitud ha creado un nuevo recurso.|
|202|Aceptado|La solicitud ha sido aceptada para su procesamiento, pero el procesamiento no se ha completado (todavía).|
|204|Sin contenido|La operación fue exitosa y la respuesta intencionalmente no contiene datos.|
|300|Opciones múltiples|Este código se utiliza para señalar las versiones de API compatibles, en caso de que se solicite una versión no compatible para un recurso en particular.|
|303|Ver otros|La respuesta a la solicitud se puede encontrar en un URI diferente y se puede recuperar utilizando un método GET en ese recurso.|
|304|No modificado|La condición especificada en los encabezados condicionales no se cumplió para una operación de lectura.|
|400|Petición Incorrecta|En el significado HTTP original, este error indica parámetros no válidos en la solicitud.|
|401|No autorizado|Falló la autenticación, pero la aplicación puede volver a intentar la solicitud mediante la autorización.|
|403|Prohibido|El servidor entendió la solicitud, pero se niega a cumplirla (por ejemplo, porque la aplicación no tiene permisos para acceder al recurso debido a las limitaciones de la política)|
|404|No encontrado|El recurso especificado no existe.|
|405|Método no permitido|El método HTTP real (como GET, PUT, POST, DELETE) no es compatible con el recurso|
|406|No aceptable|El tipo de contenido solicitado no es aceptable para el recurso.|
|408|Solicitar tiempo de espera|El cliente no produjo una respuesta en el tiempo que el servidor estaba preparado para esperar.|
|409|Conflicto|Ocurre en situaciones en las que dos instancias de una aplicación intentan modificar un recurso en paralelo, de forma no sincronizada.|
|410|Desaparecido|El recurso solicitado ya no está disponible en el servidor.|
|411|Longitud requerida|No se especificó el encabezado Content-Length.|
|412|Precondición fallida|La condición especificada en los encabezados de solicitud condicional no se cumplió para una operación.|
|413|Carga útil demasiado grande|El tamaño del cuerpo de la solicitud supera el tamaño máximo permitido por la implementación del servidor.|
|414|URI demasiado largo|La longitud del URI de la solicitud excede el tamaño máximo permitido por la implementación del servidor.|
|415|Tipo no admitido|El tipo de contenido del cuerpo de la solicitud no es compatible con el servidor.|
|429|Demasiadas solicitudes|El cliente ha enviado demasiadas solicitudes en un período de tiempo determinado.|
|500|Error interno de servidor|Error general del lado del servidor.|
|503|Servicio no Disponible|Actualmente, el servidor no puede recibir solicitudes, pero la solicitud se puede reintentar más adelante.|
