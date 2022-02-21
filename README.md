# ExamenConduccion-DEIN
Tarea de recuperación final - Test de conducción.
Realizada en Java Maven con una ui basada en Swing.

La interfaz es basica pero realice el diseño personalizado en una pagina web para que tuviera un toque mas personal, aunque no ha quedado como me gustaría por falta de tiempo.

Para realizar esta tarea he creado una base de datos en SQLite con una sola tabla llamada preguntas donde almaceno toda la infornacion referente a las preguntas respuestas y su id.
He preferido hacerlo asi porque me suponia menos lio a la hora de plantear como programarlo.

He realizado consultas mediante el driver de SQLite y he ido añadiendo a arraylist toda la informacion necesaria para mostrar y que me sirviera de referencia, la sentencia sql 
seleccionaba random una lista de preguntas con sus respuestas ordenadas por lo que asi puedo acceder a ella ordenada en cualquier momento.

En las pantallas de visualizacion de las preguntas he ido recorriendo los array para asignarlos a sus componentes Swing y comparando la seleccion del usuario con la respuesta correcta
para añadir aciertos.

Y la pantalla final muestra los aciertos y fallos del usuario y si ha aprobado el test.

Tarea de Alejandro Olivares Escapa.
