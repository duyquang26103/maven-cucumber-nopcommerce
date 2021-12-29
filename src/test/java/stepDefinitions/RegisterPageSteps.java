package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;

public class RegisterPageSteps {
    WebDriver driver;
    RegisterPageObject registerPO;

    public RegisterPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        registerPO = PageGeneratorManager.getRegisterPage(driver);
    }

    @Given("^I Click to Gender Radio Button$")
    public void iClickToGenderRadioButton() {
        registerPO.clickToGenderRadioButton();
    }

    @Given("^I Input to First Name textbox with \"([^\"]*)\"$")
    public void iInputToFirstNameTextboxWith(String firstName) {
        registerPO.inputFirstNameTextBox(firstName);
    }

    @Given("^I  Input to Last Name textbox with \"([^\"]*)\"$")
    public void iInputToLastNameTextboxWith(String lastName) {
        registerPO.inputLastNameTextBox(lastName);
    }

    @Given("^I Input to email textbox with data \"([^\"]*)\"$")
    public void iInputToEmailTextboxWithData(String email) {
        registerPO.inputEmailTextBox(email);
    }

    @Given("^I Input to password textbox with data \"([^\"]*)\"$")
    public void iInputToPasswordTextboxWithData(String password) {
        registerPO.inputPasswordTextBox(password);
    }

    @Given("^I Input to Confirm Password textbox:\"([^\"]*)\"$")
    public void iInputToConfirmPasswordTextbox(String password) {
        registerPO.inputConfirmPasswordTextBox(password);
    }

    @Given("^I Click on Register button$")
    public void iClickOnRegisterButton() {
        registerPO.clickToRegisterButton();
    }

    @Then("^Verify register successfully$")
    public void verifyRegisterSuccessfully() {
        Assert.assertTrue(registerPO.isSuccessMessageDisplayed());
    }

    @When("^I Click on 'Logout' button$")
    public void iClickOnLogoutButton() {
        registerPO.clickToLogOutButton();
    }

}
