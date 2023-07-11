package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.steps.AbrirURLStep;
import steps.steps.HomeStep;
import steps.steps.LoginStep;

public class loginOrangeHRMStepDefinition extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @Steps
    AbrirURLStep url;
    LoginStep login;
    HomeStep home;

    @Given("Mario se encuentra en el portal de Orange HRM")
    public void mario_se_encuentra_en_el_portal_de_orange_hrm() throws InterruptedException {
        url.abrirAplicacion();
    }

    @When("ingresa el usuario {string} y la contraseña {string}")
    public void ingresa_el_usuario_y_la_contraseña(String usuario, String contrasena) {
        login.ingresarUsuario(usuario);
        login.ingresarContrasena(contrasena);
        login.clicBtnLogin();
    }

    @Then("sera direccionado al home")
    public void sera_direccionado_al_home() {
        home.validarURL();
    }

    @When("Seleccione la opcion de configuracion")
    public void seleccioneLaOpcionDeConfiguracion() throws InterruptedException {
        home.seleccionarConfiguracion();
        Thread.sleep(10000);
    }
}
