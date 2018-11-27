Narrative:
Como Usuario común
Quiero enviar un correo electronico por Gmail
Para confirmar el mensaje de envio correcto

Scenario: Envio correo exitoso Gmail
Given que me encuentro en la ventana de gmail
When digite el destinatario asunto y cuerpo de mensaje
Then el sistema debera mostrarme un mensaje confirmando el envio
