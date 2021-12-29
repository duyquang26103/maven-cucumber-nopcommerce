package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends BasePage {
	WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToGenderRadioButton() {
		waitForElementClickable(driver, RegisterPageUI.GENDER_RADIO_BUTTON);
		clickToElement(driver, RegisterPageUI.GENDER_RADIO_BUTTON);

	}

	public void inputFirstNameTextBox(String firstName) {
		waitForAllsElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXBOX);
		sendKeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXBOX, firstName);
	}

	public void inputLastNameTextBox(String lastName) {
		waitForAllsElementVisible(driver, RegisterPageUI.lAST_NAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.lAST_NAME_TEXTBOX, lastName);
	}

	public void inputEmailTextBox(String email) {
		waitForAllsElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);

	}

	public void inputPasswordTextBox(String password) {
		waitForAllsElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);

	}

	public void inputConfirmPasswordTextBox(String confirmPassword) {
		waitForAllsElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);

	}

	public void clickToRegisterButton() {
		waitForAllsElementVisible(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);

	}

	public boolean isSuccessMessageDisplayed() {
		waitForAllsElementVisible(driver, RegisterPageUI.SUCCESS_MESSAGE);
		return isControlDisplayed(driver, RegisterPageUI.SUCCESS_MESSAGE);
	}

	public HomePageObject clickToLogOutButton() {
		waitForElementClickable(driver, RegisterPageUI.LOGOUT_BUTTON);
		clickToElement(driver, RegisterPageUI.LOGOUT_BUTTON);
		return PageGeneratorManager.getHomePage(driver);

	}

	public String getErrorMessageTextByID(String idName){
		waitForElementVisible(driver,RegisterPageUI.ERROR_MESSAGE_BY_ID, idName);
		return getElementText(driver,RegisterPageUI.ERROR_MESSAGE_BY_ID, idName);
	}

	public String getExistMessageText(){
		waitForElementVisible(driver,RegisterPageUI.EXIST_MESSAGE);
		return getElementText(driver,RegisterPageUI.EXIST_MESSAGE);
	}

	public boolean isWrongPasswordMessageDisplayed(){
		waitForElementVisible(driver,RegisterPageUI.EXIST_MESSAGE);
		return isControlDisplayed(driver,RegisterPageUI.EXIST_MESSAGE);
	}

}
