@Suite @ShoppingCart
Feature: CP02 - Validar carrito de compras

  Background: : Realizar 3 validaciones en el carrito de compras
    Given el ususario navega al sitio web
    When ingresa credenciales validas usuario "standard_user" y la contraseña "secret_sauce"

    @ShoppingCartAdd
    Scenario Outline: 1 - Agregar los productos en el carrito de compras
      And agrega productos al carrito de compras
      And dar click en el icono del carrito
      Then el sistema deberia listar los productos agregados en el carrito de compras
     Examples:
       |  |  |  |
       |  |  |  |


  @ShoppingCartList
    Scenario Outline: 2 - Cuando la cesta esta vacia de productos, no procesar la compra
    And dar click en el icono del carrito
    Then el sistema deberia mostrar la cesta sin productos
      Examples:
        |  |  |  |
        |  |  |  |

  @ShoppingCartProcess
    Scenario Outline: 3 - Completar el formulario de compra
      And agrega productos al carrito de compras
      And dar click en el icono del carrito
      When completa todo el registro de orden datos como "<firstname>" "<lastname>" "<postal>"
      Then el sistema deberia completar la compra
      Examples:
        | firstname | lastname | postal          |
        | Bryan     | Druet    | ECU080          |
        | Cristiano | Ronaldo  | Vilela 3500-900 |

