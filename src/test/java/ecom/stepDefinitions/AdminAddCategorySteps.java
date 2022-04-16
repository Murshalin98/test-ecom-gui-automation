package ecom.stepDefinitions;

import ecom.pages.AdminAddCategoryPOM;
import ecom.utils.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAddCategorySteps extends TestBase {
	
	AdminAddCategoryPOM adminAddCategoryPOM;
	
	@When("I click on category button")
	public void i_click_on_category_button() {
		adminAddCategoryPOM= new AdminAddCategoryPOM();
		adminAddCategoryPOM.clickOnCategory();
		
	}
	
	@When("I click on add category button")
	public void i_click_on_add_category_button() {
		adminAddCategoryPOM= new AdminAddCategoryPOM();
		adminAddCategoryPOM.clickOnAddCategoryButton();
	}
	
	@When("I enter category name")
	public void i_enter_category_name() {
		adminAddCategoryPOM.enterCategoryName();
	}
	
	@When("I click on upload image")
	public void i_click_on_upload_image() {
		adminAddCategoryPOM.clickOnUploadImage();
	}
	
	@When("I click on library tab")
	public void i_click_on_library_tab() {
		adminAddCategoryPOM.clickOnLibraryTab();
	}
	
	@When("I select the picture")
	public void i_select_the_picture() {
		adminAddCategoryPOM.clickOnTOSelectImage();
	}
	
	@When("I click on select file to upload picture")
	public void i_click_on_select_file_to_upload_picture() {
		adminAddCategoryPOM.clickOnSelectFile();
	}
	
	@When("I click on add button")
	public void i_click_on_add_button() {
		adminAddCategoryPOM.clickOnAddButton();
	}
	
	@Then("It should add a new category to the website")
	public void it_should_add_a_new_category_to_the_website() {
		adminAddCategoryPOM.assertAddCategory();
	}

}
