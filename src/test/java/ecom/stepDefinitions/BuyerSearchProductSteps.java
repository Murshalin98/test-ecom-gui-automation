package ecom.stepDefinitions;

import ecom.pages.BuyerSearchProductPOM;
import ecom.utils.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyerSearchProductSteps extends TestBase {
	
BuyerSearchProductPOM buyerSearchProductPOM;
	
	@When("I click on search bar")
	public void i_click_on_search_bar() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buyerSearchProductPOM= new BuyerSearchProductPOM();
		buyerSearchProductPOM.clickOnSearchBar();
		
	}
	
	@When("I enter seach {string} name")
	public void i_enter_seach_item_name( String item) {
		buyerSearchProductPOM= new BuyerSearchProductPOM();
		buyerSearchProductPOM.typeInSearchBar(item);
		
	}
	
	@When("I click on search icon")
	public void i_click_on_search_icon() {
		buyerSearchProductPOM= new BuyerSearchProductPOM();
		buyerSearchProductPOM.clickOnSearchIcon();
		
	}
	
	@Then("I should see the search item appear on the screen")
	public void i_should_see_the_search_item_appear_on_the_screen() {
		buyerSearchProductPOM= new BuyerSearchProductPOM();
		buyerSearchProductPOM.assertTotalFound();
		
	}

}
