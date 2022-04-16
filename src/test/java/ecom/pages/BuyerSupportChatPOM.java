package ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ecom.utils.TestBase;

public class BuyerSupportChatPOM extends TestBase{
	
	@FindBy (xpath= "//a//span[@class='cc-7doi cc-1ada']")
	private WebElement chatIcon;
	
	@FindBy (xpath= "//textarea[@placeholder='Compose your message...']")
	private WebElement messageBox;
	
	@FindBy (xpath= "//span[@class='cc-hf7r']")
	private WebElement sendIcon;
	
	@FindBy (xpath= "//span[@class='cc-2dnw cc-6zjc cc-151q']")
	private WebElement assertChat;
	
	public BuyerSupportChatPOM() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnChatIcon() {
		chatIcon.click();
	}
	
	public void clickOnMessageBox() {
		messageBox.click();
	}
	public void typeMessage() {
		messageBox.sendKeys("Hi, I am having an issue buying item in this site");
		
	}
	
	public void clickOnSendIcon() {
		sendIcon.click();
	}
	
	public void assertChat() {
		System.out.println("Message has been sent out successfully");
		
		String assertText= assertChat.getText();
		
		System.out.println(assertText);
		Assert.assertEquals(assertText, "Questions? Chat with us!");
	}
}
