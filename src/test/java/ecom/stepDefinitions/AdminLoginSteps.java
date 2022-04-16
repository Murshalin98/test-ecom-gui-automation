package ecom.stepDefinitions;

import ecom.pages.AdminLoginPOM;
import ecom.utils.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLoginSteps extends TestBase{
	
	AdminLoginPOM adminLoginPOM;
	
	@Given("Admin should navigate to the admin URL")
	public void admin_should_navigate_to_the_admin_url() {
		//intializeDriver();
	}
	
//	@When("I enter admin credential email and password")
//	public void i_enter_admin_credential_email_and_password() {
//		adminLoginPOM= new AdminLoginPOM();
//		adminLoginPOM.enterCredential(prop.getProperty("adminEmail"), prop.getProperty("adminPassword"));
//		
//		
//	}
	
	@When("I click on login button")
	public void i_click_on_login_button() {
		adminLoginPOM= new AdminLoginPOM();
		adminLoginPOM.clickOnLoginButton();
		
	}
	
	@Then("I should be login in successfully")
	public void i_should_be_login_in_successfully() {
		adminLoginPOM= new AdminLoginPOM();
		adminLoginPOM.assertText();
	}

}
