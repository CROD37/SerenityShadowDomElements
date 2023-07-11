package steps.steps;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.pageObjects.loginPage;

import java.io.IOException;

public class UploadFilesStep extends PageObject {
    loginPage login;

    public void cargarArchivo() throws InterruptedException, IOException {
        login.configuracion();
        //login.dropdown();
    }
}
