package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPageObjects {

	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By searchBox = By.id("twotabsearchtextbox");
	By searchButton = By.id("nav-search-submit-button");

	public void loginHover() {

		Select s = new Select(driver.findElement(By.xpath("//select[@name = 'url']")));
		s.selectByVisibleText("Books");
	}

	public void sendBookName(String book) {

		driver.findElement(searchBox).sendKeys(book);
	}

	public void searchMyBook() {

		driver.findElement(searchButton).click();
	}
}
