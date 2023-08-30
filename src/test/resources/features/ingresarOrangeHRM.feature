@REQ_PX-2
Feature: Ingresar al portal de Orange HRM

  @Test @REQ_PX-2
  Scenario: Ingresar al portal con un usuario valido
    Given Mario se encuentra en el portal de Orange HRM
    When ingresa el usuario "Admin" y la contraseña "admin123"
    Then sera direccionado al home

  @Test @REQ_PX-2
  Scenario: Ingresar al portal con un usuario valido
    Given Mario se encuentra en el portal de Orange HRM
    When ingresa el usuario "Admin" y la contraseña "admin123"
    Then sera direccionado al home
