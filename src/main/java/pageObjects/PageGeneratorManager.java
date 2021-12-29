package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	private static HomePageObject homePage;
	private static RegisterPageObject registerPage;
	private static LoginPageObject loginPage;

		
	private PageGeneratorManager() {
		
	}
	

	public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }
	
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}

	
	public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }
	


}
