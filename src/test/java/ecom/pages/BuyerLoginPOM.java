package ecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecom.utils.TestBase;
import io.qameta.allure.Step;

public class BuyerLoginPOM extends TestBase{

	//User icon
	@FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[3]/span[2]/i[1]")
	private WebElement userIcon;
	

	// Email field
	@FindBy(id = "normal_login_email")
	WebElement emailField;
	// Password field
	@FindBy(id = "normal_login_password")
	WebElement passwordField;
	// Login Button
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement loginButton;
	
	// User icon after login
	@FindBy(xpath="//header/div[1]/nav[1]/div[1]/div[3]/span[3]/i[1]")
	WebElement afterUserIcon;
	
	
	@FindBy(xpath="//p[contains(text(),'TS4U')]")
	WebElement buyerName;
	
	By userIcons = By.xpath("//header/div[1]/nav[1]/div[1]/div[3]/span[2]/i[1]");
	
	//Initialize the web elements
	public BuyerLoginPOM() {
		PageFactory.initElements(driver, this);
	}
	
	//Login steps
	@Step("Buyer login method")
	public void buyerLogin(String email, String password) {
		
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		
	}

	//Click user icon
	public void clickUserIcon() {
		// userIcon.click();
		// clickElementByJS(userIcon);
		clickOn(userIcons);
	}
	
	//Click on the login button
	public void clickLoginButton() {
		loginButton.click();
	}
	
	//Verify the buyer name 
//	public void verifyBuyerName() {
//		afterUserIcon.click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Assert.assertEquals(buyerName.getText(), "TS4U");
//	}
	

}
