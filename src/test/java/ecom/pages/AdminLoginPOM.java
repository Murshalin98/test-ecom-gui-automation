package ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ecom.utils.TestBase;

public class AdminLoginPOM extends TestBase {
	
	@FindBy (id= "//input[@id='basic_email']")
	private WebElement emailField;
	
	@FindBy (id= "//input[@id='basic_password']")
	private WebElement passwordField;
	
	@FindBy (xpath= "//span[normalize-space()='Login']")
	private WebElement loginButton;
	
	@FindBy (xpath= "//div[contains(text(),'TECHSERVE ADMIN')]")
	private WebElement verifyText;
	
	public AdminLoginPOM() {
		PageFactory.initElements(driver, this);
	}

//	public void enterCredential(String adminEmail, String adminPassword) {
//		
//		emailField.sendKeys(adminEmail);
//		passwordField.sendKeys(adminPassword);
//	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void assertText() {
	String textVerification= verifyText.getText();
		System.out.println(textVerification);
		
		Assert.assertEquals(textVerification, "TECHSERVE ADMIN");
	}
}
