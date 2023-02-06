package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.PageObjectManager;
import Utility.TextContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Test
public class LoginStepDefination {

	public WebDriver driver;
	public TextContextSetUp textContext;
	public LoginPageObjects loginPage;
	public PageObjectManager pageObject;
	public LoginStepDefination(TextContextSetUp textContext) {
		this.textContext = textContext;
		this.loginPage = textContext.pageObject.getloginPage();	
	}
	
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
 loginPage.loginHover();
	}

    @When("^User enters the (.+) and navigates to password page$")
    public void user_enters_the_and_navigates_to_password_page(String username) throws Throwable {
     loginPage.sendBookName(username);  
    }

	@Then("User lands on the home page")
	public void user_lands_on_the_home_page() {
		loginPage.searchMyBook();
		System.out.println("Thank you your execution is done");
	}

}
