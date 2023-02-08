#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@authentification
Feature: Authentification de l application  SwagLabs
  En tant que utilisateur je souhaite naviger afin de ...

  @login-CasPassant
  Scenario: Authentification sur l application Swaglabs - Cas Passant
    Given Je me connecte sur l application SwagLabs
    When Je saisis le User Name par "standard_user"
    And Je saisis le Password par "secret_sauce"
    And Je clique sur le boutton LOGIN
    Then Je me redirige vers la page Home "PRODUCTS"
