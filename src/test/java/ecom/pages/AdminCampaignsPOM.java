package ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ecom.utils.TestBase;

public class AdminCampaignsPOM extends TestBase {

	@FindBy(xpath = "//a[normalize-space()='Campaigns']")
	private WebElement campaignButton;

	@FindBy(xpath = "//span[normalize-space()='Create New Campaign']")
	private WebElement createCampaignButton;

	@FindBy(xpath = "//input[@placeholder='Enter campaign name']")
	private WebElement campaignName;

	@FindBy(xpath = "//span[normalize-space()='Upload image']")
	private WebElement uploadImageButton;

//	@FindBy (xpath= "(//p[@class='m-0'])[1]")
//	private WebElement clickToUploadImage;

	@FindBy(xpath = "//a[@id='react-media-library-tabs-tab-library']")
	private WebElement libraryButton;

	@FindBy(xpath = "//div[normalize-space()='dJ23Hwnfh-07802071990001.jpg']")
	private WebElement selectImage;

	@FindBy(xpath = "//button[normalize-space()='Select File']")
	private WebElement selectFileButton;

	@FindBy(xpath = "//input[@placeholder='Start date']")
	private WebElement startDate;
	
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='21'])[1]")
	private WebElement enterStartDate;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[7]/div")
	private WebElement enterEndDate;
	
	
	@FindBy(xpath = "//span[normalize-space()='Ok']")
	private WebElement okButton;
	
	@FindBy(xpath = "//input[@placeholder='End date']")
	private WebElement endDate;

	@FindBy(xpath = "//span[normalize-space()='Create']")
	private WebElement createButton;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[3]/span")
	private WebElement verifyActiveStatus;
	
	public AdminCampaignsPOM() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCampaignButton() {
		campaignButton.click();
	}

	public void clickOnCreatCampaignButton() {
		createCampaignButton.click();
	}

	public void enterCampaignName() {
		campaignName.sendKeys("Spring Sale");
	}

	public void clickOnUploadImageButton() {
		uploadImageButton.click();
	}

	public void clickOnLibraryButton() {
		libraryButton.click();
	}

	public void clickToSelectImage() {
		selectImage.click();
	}

	public void clickOnSelectFileButton() {
		selectFileButton.click();
	}

	public void enterStartDate() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startDate.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterStartDate.click();
		okButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		enterEndDate.click();
		okButton.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterEndDate() {
		endDate.sendKeys("10/20/2022");
	}

	public void clickOnCreateButton() {
		createButton.click();
	}

	public void assertCampaign() {
		
		String assertText= verifyActiveStatus.getText();
		Assert.assertEquals(assertText, "Active");
	}

}
