package ecom.stepDefinitions;

import ecom.pages.BuyerReviewCartListPOM;
import ecom.utils.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyerReviewCartListSteps extends TestBase{
	
	BuyerReviewCartListPOM buyerReviewCartListPOM;
	
	@When("I click on the cart icon")
	public void i_click_on_the_cart_icon() {
		buyerReviewCartListPOM= new BuyerReviewCartListPOM();
		buyerReviewCartListPOM.clickOnBagIcon();
	}
	
	@Then("My item in the cart should be visible")
	public void my_item_in_the_cart_should_be_visible() {
		buyerReviewCartListPOM= new BuyerReviewCartListPOM();
		buyerReviewCartListPOM.assertCart();
	}

}
