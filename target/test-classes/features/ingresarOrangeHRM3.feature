@REQ_PX-2
Feature: Cargar archivos

  @Test4 @REQ_PX-2 @TEST_PX-6
  Scenario: Cargar archivos
    Given Mario se encuentra en el portal de the internet
    When Cargue su archivo

  @Test3 @REQ_PX-2 @TEST_PX-5
  Scenario: Ingresar al portal con un usuario valido6
    Given Mario se encuentra en el portal de Orange HRM
    When ingresa el usuario "Admin" y la contraseña "admin123"
    When Seleccione la opcion de configuracion

