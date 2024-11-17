@Suite @Login
Feature: CP01 - Validar inicio de sesion

  Background: Validar el incio de sesion con credenciales validas e invalidas

    Given  el ususario navega al sitio web

    @ValidCredentials
    Scenario Outline: 1 - Validar con credenciales correctas

      When ingresa credenciales validas usuario "standard_user" y la contraseña "secret_sauce"
      Then la aplicacion deberia mostrar el modulo principal de productos
      Examples:
        | user          | password     |  |
        | standard_user | secret_sauce |  |

  @InvalidCredentials
  Scenario Outline: 2 - Validar con credenciales incorrectas
      When ingresa credenciales invalidas usuario "<usuario>" y la contraseña "<contrasena>"
        Then la aplicacion deberia mostrar un mensaje de error
      Examples:
        | usuario    | contraseña  | mensaje                               |
        | admin      | 12345       | Bienvenido, admin!                      |
        | usuario1   | pass123     | Usuario o contraseña incorrectos.       |

