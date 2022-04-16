package ecom.stepDefinitions;

import ecom.pages.AdminCampaignsPOM;
import ecom.utils.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminCampaignsSteps extends TestBase {
	AdminCampaignsPOM adminCampaignsPOM;
	
	@When("I click on campaign button")
	public void i_click_on_campaign_button() {
		adminCampaignsPOM= new AdminCampaignsPOM();
		adminCampaignsPOM.clickOnCampaignButton();
	}
	
	@When("I click on create new campaign")
	public void i_click_on_create_new_campaign() {
		adminCampaignsPOM= new AdminCampaignsPOM();
		adminCampaignsPOM.clickOnCreatCampaignButton();
	}
	
	@When("I enter the campaign name")
	public void i_enter_the_campaign_name() {
		adminCampaignsPOM= new AdminCampaignsPOM();
		adminCampaignsPOM.enterCampaignName();
	}
	
	@When("I upload the campaign image")
	public void i_upload_the_campaign_image() {
		adminCampaignsPOM= new AdminCampaignsPOM();
		adminCampaignsPOM.clickOnUploadImageButton();
		adminCampaignsPOM.clickOnLibraryButton();
		adminCampaignsPOM.clickToSelectImage();
		adminCampaignsPOM.clickOnSelectFileButton();
	}
	
	@When("I select the date for campaign")
	public void i_select_the_date_for_campaign() {
		adminCampaignsPOM= new AdminCampaignsPOM();
		adminCampaignsPOM.enterStartDate();
		adminCampaignsPOM.enterEndDate();
	}
	
	@When("I click on the create button")
	public void i_click_on_the_create_button() {
		adminCampaignsPOM= new AdminCampaignsPOM();
		adminCampaignsPOM.clickOnCreateButton();
	}
	
	@Then("I should have a new campign in the website")
	public void i_should_have_a_new_campign_in_the_website() {
		adminCampaignsPOM.assertCampaign();
	}
}
