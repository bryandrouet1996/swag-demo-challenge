@Suite @Login
Feature: CP0 - Validar inicio de sesion

  Background: Validar el incio de sesion con credenciales validas e invalidas

    Given  el ususario navega al sitio web

    @ValidCredentials
    Scenario: 1 - Validar con credenciales correctas

      When ingresa credenciales validas
      Then la aplicacion deberia mostrar el modulo principal de productos

    @InvalidCredentials
    Scenario: 2 - Validar con credenciales incorrectas
        When ingresa credenciales invalidas
        Then la aplicacion deberia mostrar un mensaje de error