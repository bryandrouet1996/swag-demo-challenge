Instrucciones para ejecutar las pruebas:

1. Clonar el repositorio:
   
  Nos dirigimos al enlace del challenge, despues hacemos click en code, a continuacion nuevamente hacemos click en el icono Copy url to clipboar.
  Luego abrimos Intellij IDEA hacemos click en file, click en new, click en Project From Version Control pegamos el url y damos click en clone.

   git clone https://github.com/bryandrouet1996/swag-demo-challenge

2. Navegar al directorio del proyecto:

   cd swag-demo-challenge

3. Ejecutar las pruebas con Gradle:
   

    - Maquina local con el sistema operativo Windows 10
    - IDE IntelliJ version 2024.2.1
    - Gradle version 7.6.1
    - JDK versión 17

4. Herramientas instaladas

   
 -Sonarlint

 -Lombok

 -Cucumber +

 -Gherking

 -Cucumber for java

5. Instrucciones para ejecutar los test

-Dirigirse a la ubicacion java/com/swag/pe/Runner.java y pulsar el icono de iniciar pruebas esto arrancara inmediatamente con las pruebas

-Para tener el reporte de las pruebas hacemos click en el icono de gradle a mano derecha y hacemos click en el botón execute gradle task y ejecutamos el comando: gradle aggregate.

-Despues hacemos click en en el enlace que se muestra con el siguiente mensaje:
Main report: file:///C:/Users/Admin/Desktop/challenge/sauce-demo-test/target/site/serenity/index.html
Para de esta manera acceder al reporte.

6. Información adicional

   Las features tienen un respectivo indicador para ser ejecutadas de forma individual como se va a detallar a continuacion.
   
   
   Si deseamos ejecutar las del Login en nuestro Runner en la linea numero 11 ponemos el siguiente comando
-tags = "@Login" Nos va permitir ejecutar nuestras pruebas de inicio de sesion

-tags = "@ValidCredentials" para ejecutar con credenciales correctas

-tags = "@InvalidCredentials" para ejecutar con credenciales incorrectas

-tags = "@ShoppingCart" si deseamos ejecutar todas pruebas de nuestra segunda feature products

-tags = "@ShoppingCartAdd" para ejecutar agregar productos 

tags = "@ShoppingCartList" para ejecutar visualizacion de carrito de compras

tags = "@ShoppingCartProcess" para ejecutar el proceso de compra

tags = "@Suite" para ejecutar todas las pruebas
