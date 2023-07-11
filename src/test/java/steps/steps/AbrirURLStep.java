package steps.steps;

import net.thucydides.core.annotations.Step;
import pageObjects.pageObjects.loginPage;

public class AbrirURLStep {
    loginPage login;

    @Step
    public void abrirAplicacion(){
        login.open();
    }
}
