package steps.steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pageObjects.pageObjects.loginPage;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HomeStep extends PageObject {
    loginPage login;

    @Step
    public void validarURL() {
        //assertThat(getDriver().getCurrentUrl(), containsString("https://opensource-demo.orangehrmlive.com/index.php/dashboard"));
    }

    @Step
    public void seleccionarConfiguracion() {
        //login.configuracion();
    }
}
