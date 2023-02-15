@authentification
Feature: Authentification de l application  nopcommerce
  En tant que utilisateur je souhaite naviger afin de ...

  @login-CasPassant
  Scenario: Authentification sur l application nopcommerce - Cas Passant
    Given Je me connecte sur l application nopcommerce
    When Je saisis l Email par "admin@yourstore.com"
    And Je saisis le Password par "admin"
    And Je clique sur le boutton LOGIN
    Then Je me redirige vers la page Home "PRODUCTS"
