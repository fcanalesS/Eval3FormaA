Feature: Prueba de casos ingresando nombre de username y password
Scenario: Verificacion de ingreso de sesion
Given Abrir Chrome
When Ingresa Username "test2" y Password "test123"
Then Inicia Sesion