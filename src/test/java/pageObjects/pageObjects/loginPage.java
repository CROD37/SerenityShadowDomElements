package pageObjects.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.WebDriverFacade;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static java.util.concurrent.TimeUnit.SECONDS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class loginPage extends PageObject {
//    @FindBy(id="txtUsername")
//    WebElementFacade nombreDeUsuario;
//
//    private static final By nombreDeUsuario2 =By.id("txtUsername");
//
//    By nombreDeUsuario3 = By.id("txtUsername");
    

    public void ingresarUsuario(String usuario) {
//        getDriver().findElement(nombreDeUsuario3).sendKeys(usuario);
//        find(nombreDeUsuario2).clear();
//        nombreDeUsuario.type(usuario);
        $(By.name("username")).type(usuario);
    }

    public void ingresarContrasena(String contrasena) {
        $(By.name("password")).type(contrasena);
    }

    public void clicBtnLogin() {
        $(By.tagName("button")).click();
        //$(ByShadow.cssSelector("#shadowedInput", "#shadow-host", "#inner-shadow-host")).click();
    }

    public void configuracion() throws IOException {
        /*WebElement logoField = $(By.id("file-upload"));
        //upload("C:\\Users\\Carlos\\Downloads\\Actividad 1.docx").to(logoField);
        AndroidDriver androidDriver =(AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();
        androidDriver.pushFile("/data/local/tmp/Actividad1.docx", new File("C:\\Users\\Carlos\\Downloads\\Actividad1.docx"));
        logoField.sendKeys("//data//local//tmp//Actividad1.docx");*/
        $(ByShadow.cssSelector("#fname", "#open-shadow")).sendKeys("12344");
    }

    public void dropdown() throws InterruptedException {
        WebElement drop = $(ByShadow.cssSelector("#dropdown_1", "bdb-at-dropdown"));
        drop.click();
        Thread.sleep(3000);
        System.out.println(drop.getText());
    }
}
