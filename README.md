
# Documentación

La solución debería contener un fichero README donde se respondan estas preguntas:
- ¿Qué has empezado implementando y por qué?
<br/><br/>
He leído que se valoraría positivamente el uso de TDD, así que he decidido empezar por allí.
Primero he creado una clase Ciudad, que contenga como atributos: nombre, fecha y clima, ya que usar un modelo me parecía mejor que usar simples variables.
Una vez he tenido el modelo, he hecho el test, y al ver que funcionaba he seguido el proyecto a partir de ahí.
<br/><br/>
- ¿Qué problemas te has encontrado al implementar los tests y cómo los has solventado?
<br/><br/>
No he encontrado ninguno, ya que el test era sencillo y simplemente he instanciado un objeto ciudad, creado la conexión a la api y hacer un setter del atributo clima.
A partir de allí he ido arreglando un poco el código, sin modificarlo demasiado, ya que la mayoría de errores eran de hardcoding y tampoco eran muchas líneas.
<br/><br/>
- ¿Qué componentes has creado y por qué?
<br/><br/>
He creado una clase java Ciudad y otra Repositorio, para evitar tener el código en un solo archivo. Conozco el patrón Modelo Vista Controlador, y he querido adaptarlo a pequeña escala,
aunque no hubiera ni vista ni base de datos. Es sencillo pero creo que queda bien.
<br/><br/>
- ¿Has utilizado  streams, lambdas y optionals de Java 8? ¿Qué te parece la programación funcional?
<br/><br/>
No los he usado, aunque conozco las lambdas y las referencias a código ya que son elementos que usé en Android y programación concurrente.
La programación funcional me parece interesante, ya que se ahorra código  y funciona especialmente bien con la programación orientada a objetos.
<br/><br/>
- ¿Qué piensas del rendimiento de la aplicación?
<br/><br/>
Los tests me suelen tardar 2,5 segundos en averiguar el clima de una ciudad. En mi opinión es un poco lento y se tendría que mejorar o replantear.
<br/><br/>
- ¿Qué harías para mejorar el rendimiento si esta aplicación fuera a recibir al menos 100 peticiones por segundo?
<br/><br/>
Creo que se debería aplicar programación concurrente con multithreading. En el caso de esta app los usuarios no modifican nada, sólo consultan.
Así que bloquear síncronamente el recurso no tiene mucho sentido. Con programación asíncrona se podría solucionar un exceso de peticiones al servidor.
<br/><br/>
- ¿Cuánto tiempo has invertido para implementar la solución?
<br/><br/>
No he invertido demasiado, empecé el día anterior a este, haciendo el modelo y planteando qué hacer. Y hoy lo he acabado. Diría que alrededor de 3-4 horas.
Mi principal dificultad ha sido como afrontar la solución, qué tipo de diseño usar, si modular simplemente... Al final he acabado respetando la estructura pero añadiendo un poco de diseño.
<br/><br/>
- ¿Crees que en un escenario real valdría la pena dedicar tiempo a realizar esta refactorización?
<br/><br/>
Sí, al menos en lo que refiere al uso de variables, ya que si no son descriptivas o no se usan suficiente, se puede tardar mucho en modificar o leer el programa.
<br/><br/>


# Entrega
https://github.com/rogersm92/weather_report
