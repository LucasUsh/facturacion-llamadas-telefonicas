## Ejercicio de facturación de llamadas telefónicas
### Comentarios
Como la resolución del ejercicio era abierta, dejo algunos comentarios y aclaraciones:
* Elegí utilizar Java, porque lo frecuento y por las bibliotecas que ofrece, favoreciendo la reutilización de objetos que vienen muy bien para este ejercicio.
* Podría haberse implementado algún método de planificación de tareas, por ejemplo teniendo un repositorio de llamadas y pudiendo ejecutar todos los meses automáticamente la facturación (se filtrarían las llamadas del mes correspondiente y se facturaría en base a ellas). Pero no quise caer en sobrediseño y decidí ir por la opción más simple que cumpla el objetivo.
* Consideré como días hábiles de lunes a viernes, para evitar complejidades por feriados, por ejemplo.
* La clases que heredan de Llamada (Local y Externa) obtienen los valores de costos por minuto desde el enum correspondiente (CostoLocal y Region).
* Los valores de costos por minuto, en vez de existir a través de enums, podrían ser levantados de un archivo de properties, aunque en ese caso sería mejor que sean inyectados por constructor para las clases que heredan de Llamada, para no quedar acopladas a esa implementación.
* Para las llamadas nacionales e internacionales, tomé como costo la duración de la llamada por el costo por minuto de la región correspondiente.
* Las funcionalidades están testeadas.
### Diagrama de clases
![](http://www.plantuml.com/plantuml/png/VL9FxvD04BtlfvZyJcgW7u0OKWIg9BGq20Uz3R1fDza_pUuIDUhdykud4vQkbCO81sPdthotxuMziQZjA3ZfEHe31-pjg16-4vWUGKq4HoNjrHsnKrAzGqCZ6DJOSUgwdAF00KsfUkJpGicCVLiktNW3oRzQgYN-4zChOrMZBF9NhrT-FoYt8l-3U947p4z2i3DMOszXWNc7mpWrcP8HP5Dbfsebt18i-JXzdmxg7XigRaeZpsWXsSGKBP0CBMsOS9jKZWBIcV5nEq-hKtKiqYg0DAchly2I2MRf1wNnp7fr1nUdGruNLHt0n_RiglLAYrzlIDEBirExhsUz7--OpqcTD7a0JNBAYZ9mlRPktxV9fm2A9YcB983Vl-Pt9bXk7Owty4ViuoDUzQdj_vzGiylLXZ6yl7dnGy-q6zGNkOiV8daQR2CWgzOy3sFlZLpPG86Ac_q6WegEQaFsL0wZu7y0)
### Output del main
```
Factura del servicio de llamadas telefónicas
Mes: JUNE
Costo de abono básico: $150,00
Costo de llamadas locales: $10,40
Costo de llamadas nacionales e internacionales: $66,10
Costo total: $ 226,50
```
