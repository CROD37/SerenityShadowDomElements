package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Steps;
import steps.steps.UploadFilesStep;

import java.io.IOException;

public class TheInternetstepdefinitions extends UIInteractionSteps {
    @Steps
    UploadFilesStep uploadFiles;

    @Given("Mario se encuentra en el portal de the internet")
    public void marioSeEncuentraEnElPortalDeTheInternet() {
        //openUrl("https://the-internet.herokuapp.com/upload");
        openUrl("https://letcode.in/shadow");
    }

    @When("Cargue su archivo")
    public void cargueSuArchivo() throws InterruptedException, IOException {
        uploadFiles.cargarArchivo();
        Thread.sleep(10000);
    }
}
