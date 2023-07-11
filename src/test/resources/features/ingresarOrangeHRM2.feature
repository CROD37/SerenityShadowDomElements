Feature: Ingresar al portal de Orange HRM 2

  @Test
  Scenario: Ingresar al portal con un usuario valido
    Given Mario se encuentra en el portal de Orange HRM
    When ingresa el usuario "Admin" y la contraseña "admin123"
    Then sera direccionado al home

  @Test
  Scenario: Ingresar al portal con un usuario valido2
    Given Mario se encuentra en el portal de Orange HRM
    When ingresa el usuario "Admin" y la contraseña "admin123"
    Then sera direccionado al home
