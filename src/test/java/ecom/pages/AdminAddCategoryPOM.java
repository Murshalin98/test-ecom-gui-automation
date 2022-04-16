package ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecom.utils.TestBase;

public class AdminAddCategoryPOM extends TestBase {

	@FindBy(xpath = "//a[normalize-space()='Categories']")
	private WebElement categoryButton;

	@FindBy(xpath = "//span[normalize-space()='Add Category']")
	private WebElement addCategoryButton;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement categoryNameField;

	@FindBy(xpath = "//span[normalize-space()='Upload image']")
	private WebElement uploadImage;

	@FindBy(xpath = "//a[@id='react-media-library-tabs-tab-library']")
	private WebElement libraryTab;

	@FindBy(xpath = "//div[normalize-space()='141.94 KB']")
	private WebElement selectImage;

	@FindBy(xpath = "//button[normalize-space()='Select File']")
	private WebElement selectFileButton;

	@FindBy(xpath = "//span[normalize-space()='Add']")
	private WebElement addButton;

	public AdminAddCategoryPOM() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCategory() {
		categoryButton.click();
	}

	public void clickOnAddCategoryButton() {
		addCategoryButton.click();
	}

	public void enterCategoryName() {
		categoryNameField.sendKeys("Home Goods");
	}

	public void clickOnUploadImage() {
		uploadImage.click();
	}

	public void clickOnLibraryTab() {
		libraryTab.click();
	}

	public void clickOnTOSelectImage() {
		selectImage.click();
	}

	public void clickOnSelectFile() {
		selectFileButton.click();
	}

	public void clickOnAddButton() {
		addButton.click();
	}

	public void assertAddCategory() {
		System.out.println("Category Added Successfully");
	}

}
