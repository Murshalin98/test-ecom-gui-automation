package ecom.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecom.utils.TestBase;

public class AdminAddProductPOM extends TestBase {

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div/div[2]/nav/ul/li[5]/div[1]/span[2]")
	private WebElement productButton;

	@FindBy(xpath = "//a[normalize-space()='Create Product']")
	private WebElement createProductButton;

	@FindBy(xpath = "//input[@placeholder='Product name']")
	private WebElement productNameField;

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
	private WebElement productCategory;

	@FindBy(xpath = "//input[@placeholder='Unit (e.g. KG,Pc etc)']")
	private WebElement productUnit;

	@FindBy(xpath = "//input[@placeholder='Product price']")
	private WebElement productUnitPrice;

	@FindBy(xpath = "//span[normalize-space()='Upload thumbnail']")
	private WebElement uploadProductPicture;

	@FindBy(xpath = "//a[@id='react-media-library-tabs-tab-library']")
	private WebElement libraryPicture;

	@FindBy(xpath = "//div[normalize-space()='hpnfEbs_x-treadmill-fitrun-30.jpg']")
	private WebElement attachPicture;

	@FindBy(xpath = "//button[normalize-space()='Select File']")
	private WebElement selectFile;

	@FindBy(xpath = "//div[@class='ant-switch-handle']")
	private WebElement shippingOptionSwitch;

	@FindBy(xpath = "//span[normalize-space()='Save Product']")
	private WebElement saveProductButton;
	
	@FindBy (xpath= "//div[contains(text(),'Health & Beauty')]")
	WebElement pickCate;

	public AdminAddProductPOM() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnProductButton() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		productButton.click();
	}

	public void clickOnCreateProductButton() {
		createProductButton.click();
	}

	public void enterProductInformation(String name, String unit, String price) {
		productNameField.sendKeys(name);
		
		
		productCategory.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pickCate.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		productCategory.sendKeys(category);
//		productCategory.sendKeys(Keys.ENTER);
		productUnit.sendKeys(unit);
		uploadProductPicture.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		libraryPicture.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		attachPicture.click();
		
		selectFile.click();
		productUnitPrice.sendKeys(price);
		
	}

	public void uploadProductImage() {

//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		uploadProductPicture.click();
//
//		libraryPicture.click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		attachPicture.click();
//		
//		selectFile.click();
//		
		System.out.println("Uploaded Image");
	}
	public void clickOnShippingOptionButton() {
		shippingOptionSwitch.click();
	}

	public void clickOnSaveProductButton() {
		saveProductButton.click();
	}

	public void assertAddProduct() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
	}

}
