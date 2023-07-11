package steps.steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pageObjects.pageObjects.loginPage;

public class LoginStep extends PageObject {
    loginPage loginPage;

    @Step
    public void ingresarUsuario(String usuario) {
        loginPage.ingresarUsuario(usuario);
    }

    @Step
    public void ingresarContrasena(String contrasena) {
        loginPage.ingresarContrasena(contrasena);
    }

    @Step
    public void clicBtnLogin() {
        loginPage.clicBtnLogin();
    }
}
