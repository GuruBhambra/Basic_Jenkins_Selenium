package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	public LoginPageObjects loginPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public LoginPageObjects getloginPage() {

		loginPage = new LoginPageObjects(driver);
		return loginPage;

	}
}
