Feature: Pruebas de conexion a BD, login del sitio y reserva 
Scenario: Conexion BD Incorrecta
Given Probar conexion BD ""
Scenario: Conexion BD Correcta
Given Probar conexion BD "jdbc:mysql://localhost:3306/clinica"

Scenario: Caso 1: Login sin datos
Given abrir navegador
When ingresa Username "" y Password ""
Then inicia sesion

Scenario: Caso 2: Login con datos incorrectos
Given abrir navegador
When ingresa Username "userbasic" y Password "qwerty"
Then inicia sesion

Scenario: Caso 3: Login con datos correctos
Given abrir navegador
When ingresa Username "pablo" y Password "123456"
Then inicia sesion

Scenario: Conectar al sitio,iniciar sesión, reservar hora.
Given abrir navegador
When ingresa Username "pablo" y Password "123456" 
Then inicia sesion
When Agenda Hora rut="333" nombre="javier" apellido="viran" direccion="independencia" email="javier@mail.com" telefono="76767676" nombreMascota="duke" tipoMascota="perro" edad="3" hora="11:30" fecha="20/10/2020"
Then Reservar Hora
And Cerrar navegador