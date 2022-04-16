package ecom.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecom.utils.TestBase;

public class Buyer_Address_Add_Update_DeletePOM extends TestBase{
	
	public Buyer_Address_Add_Update_DeletePOM() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "(//i[@class = 'fas fa-bars']")
	private WebElement burgerIcon;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement myAccountOption;
	
	@FindBy(xpath = "//div[@id='profile']//li[2]")
	private WebElement addRess;
	
	@FindBy(xpath = "//div[@class='heading_title']//button")
	private WebElement addNewOption;
	
	@FindBy(xpath = "(//input[@id='form_in_modal_name'])[1]")
	private WebElement fullName;
	
	@FindBy(xpath = "(//textarea[@id='form_in_modal_address'])[1]")
	private WebElement inputAddress;
	
	@FindBy(xpath  = "(//input[@id='form_in_modal_zip'])[1]")
	private WebElement zipCode;
	
	@FindBy(xpath = "(//input[@id='form_in_modal_city'])[1]")
	private WebElement city;
	
	@FindBy(xpath = "(//input[@id='form_in_modal_state'])[1]")
	private WebElement state;
	
	@FindBy(xpath = "(//input[@id='form_in_modal_mobileNumber'])[1]")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']//span")
	private WebElement createButton;
	
	
	//Updated user information
	@FindBy(xpath = "(//*[name()='svg'])[2]")
	private WebElement editOptions;
	
	@FindBy(xpath = "(//input[@id='form_in_modal_name'])[1]")
	private WebElement updateFullNmae;
	
	@FindBy(xpath = "(//textarea[@id='form_in_modal_address'])[1]")
	private WebElement updatedAddress;
	
	
	@FindBy(xpath = "(//input[@id='form_in_modal_zip'])[1]")
	private WebElement updateZipCode;
	
	@FindBy(xpath = "(//input[@id='form_in_modal_city'])[1]")
	private WebElement updatedCity;
	
	//Updated State
	@FindBy(xpath = "(//span[@title='New York'])[1]")
	private WebElement updatedState;
	
	@FindBy(xpath = "(//input[@id='form_in_modal_mobileNumber'])[1]")
	private WebElement updatedMobileNumber;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']//span")
	private WebElement updateButtons;
	
	@FindBy(xpath = "(//*[name()='svg'])[3]")
	private WebElement deleteIcons;
	
	
	
	public void clickONBurger01() {
		burgerIcon.click();
	}
	
	public void clickOnmyAccountOption02() {
		myAccountOption.click();
	}
	
	public void clickONaddRess03() {
		addRess.click();
	}
	
	public void clickOnaddNewOption04() {
		addNewOption.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void inputAllAddress05(String name, String adresses, String zipCodes, String cities, String states, String mNumber) {
		fullName.sendKeys(name);
		inputAddress.sendKeys(adresses);
		zipCode.sendKeys(zipCodes);
		city.sendKeys(cities);
		state.sendKeys(states);
		state.sendKeys(Keys.ARROW_DOWN.ENTER);
		mobileNumber.sendKeys(mNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	
	public void clickcreateButton06() {
		createButton.click();
	}
	
//Update Address//Updated user information
	
	
	public void clickeditOptions07() {
		editOptions.click();
	}
	
	public void updatedUserInformation08() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateFullNmae.sendKeys("selena gomez");
		updatedAddress.sendKeys("124 long Island");
		updateZipCode.sendKeys("14523");
		updatedCity.sendKeys("New York");
		updatedState.sendKeys("New York");
		updatedMobileNumber.sendKeys("3472954678");
		
		
	}
	public void clickupdateButtons09() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateButtons.click();
	}
	
	public void clickdeleteIcons10() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		deleteIcons.click();
		driver.switchTo().alert().accept();
		
	}
	
	public void driverquite11() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
	
	}
