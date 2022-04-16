package ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ecom.utils.TestBase;

public class BuyerReviewCartListPOM extends TestBase{
	
	@FindBy (xpath= "//div[@class='header_info']//i[@class='fas fa-shopping-bag']")
	private WebElement bagIcon ;
	
	@FindBy (xpath= "//span[normalize-space()='My cart']")
	private WebElement myCartText;
	
	public BuyerReviewCartListPOM() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnBagIcon() {
		bagIcon.click();
	}
	
	public void assertCart() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		myCartText.getText();
		
		String verifyCart= myCartText.getText();
		
		System.out.println(verifyCart);
		
		Assert.assertEquals(verifyCart, "My cart");
	}
}
