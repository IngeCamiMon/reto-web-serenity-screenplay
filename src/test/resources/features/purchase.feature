Feature: Compra en SauceDemo

  Scenario: Compra exitosa de producto

    Given que el usuario abre Saucedemo
    When realiza login y agrega un producto al carrito
    And completa el proceso de compra
    Then debe visualizar mensaje de compra exitosa