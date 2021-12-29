package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;

public class HomePageSteps {
    WebDriver driver;
    HomePageObject homePO;
    RegisterPageObject registerPO;

    public HomePageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        homePO = PageGeneratorManager.getHomePage(driver);
    }

    @Given("^I click to register link$")
    public void iClickToRegisterLink()  {
        homePO.clickToRegisterPage();
    }
}
