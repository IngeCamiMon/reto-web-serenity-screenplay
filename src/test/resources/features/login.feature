Feature: Login SauceDemo

  Scenario: Login exitoso

    Given que el usuario abre Saucedemo
    When ingresa sus credenciales validas
    Then debe visualizar el catalogo de productos