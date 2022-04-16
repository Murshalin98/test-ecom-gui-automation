package ecom.stepDefinitions;

import ecom.pages.BuyerLoginPOM;
import ecom.utils.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//@Epic("Authentication and Authorization")
//@Severity(SeverityLevel.NORMAL)
//@Feature("Login Feature")
//@Story("As a user i want to login")

public class Buyer_Login_Steps extends TestBase{
	BuyerLoginPOM buyerLoginPOM;
	
	@Given("Buyer should navigate to the baseURL")
	public void buyer_should_navigate_to_the_baseURL() {
		//intializeDriver();
	}
	
	@When("I click on the user icon")
	@Description("I click on the user icon")
	public void i_click_on_the_user_icon() {
		buyerLoginPOM=new BuyerLoginPOM();
		buyerLoginPOM.clickUserIcon();
		
	}
	
	@When("I enter the registered email address and password")
	public void i_enter_the_registered_email_address_and_password() {
		buyerLoginPOM.buyerLogin(prop.getProperty("email"),prop.getProperty("password"));
	    
	    
	}
	@When("I click on the Log in button")
	public void i_click_on_the_log_in_button() {
	    buyerLoginPOM.clickLoginButton();
	}
//	@Then("I should be able to login successfully")
//	public void i_should_be_able_to_login_successfully() {
//	   buyerLoginPOM.verifyBuyerName();
//	   driver.quit();
//	}

}
