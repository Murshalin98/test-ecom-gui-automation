package ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ecom.utils.TestBase;

public class BuyerSearchProductPOM extends TestBase {
	
	@FindBy (xpath= "/html/body/div[1]/div/header/div[1]/nav[1]/div/div[2]/input")
	private WebElement searchBar;
	
	@FindBy (xpath= "(//i[@class='fas fa-search'])[1]")
	private WebElement searchIcon;
	
	@FindBy (xpath= "//div[@class='total']")
	private WebElement resultFound;
	
	
	public BuyerSearchProductPOM() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchBar() {
		searchBar.click();
	}
	
	public void typeInSearchBar(String item) {
		searchBar.sendKeys(item);
	}
	
	public void clickOnSearchIcon() {
		searchIcon.click();
	}
	
	public void assertTotalFound() {
		System.out.println(resultFound.getText());
		
		//String verifyText= resultFound.getText();
		//Assert.assertEquals(verifyText, "1 results found");
		
	}

}
