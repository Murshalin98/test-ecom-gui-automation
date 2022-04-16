package ecom.stepDefinitions;

import java.util.List;

import ecom.pages.BuyerLoginPOM;
import ecom.pages.Buyer_Address_Add_Update_DeletePOM;
import ecom.utils.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Buyer_UpdateAndDeleteAddress_Steps extends TestBase{
	BuyerLoginPOM buyerLoginPOM;
	Buyer_Address_Add_Update_DeletePOM updateAndDelete;
	
	
	@When("I login with my user credentials")
	public void i_login_with_my_user_credentials() {
		buyerLoginPOM = new BuyerLoginPOM();
		buyerLoginPOM.clickUserIcon();
		buyerLoginPOM.buyerLogin("techserve4umeeting@gmail.com", "string");;
		buyerLoginPOM.clickLoginButton();
	   
	}
	@When("I click on the burger icon")
	public void i_click_on_the_burger_icon() {
		updateAndDelete  = new Buyer_Address_Add_Update_DeletePOM();
		updateAndDelete.clickONBurger01();
		
	    
	}
	@When("I click on my account")
	public void i_click_on_my_account() {
		updateAndDelete.clickOnmyAccountOption02();
	   
	}
	@When("I click on the Address")
	public void i_click_on_the_address() {
		updateAndDelete.clickONaddRess03();
	   
	}
	@When("I click on new Address")
	public void i_click_on_new_address() {
		updateAndDelete.clickOnaddNewOption04();
	   
	}
	@When("I enter all input address fields")
	public void i_enter_all_input_address_fields(DataTable dataTable) {
		List<List<String>> addressIn = dataTable.cells();
		
		
//		System.out.println(addressIn.get(0).get(0));
		String fname = addressIn.get(0).get(0);
		String adressed = addressIn.get(0).get(2);
		String zipCoded = addressIn.get(0).get(3);
		String citiess = addressIn.get(0).get(4);
		String statess = addressIn.get(0).get(5);
		String mNumbers = addressIn.get(0).get(6);
		updateAndDelete.inputAllAddress05(fname,adressed,zipCoded,citiess, statess, mNumbers);
		
		
	    
	}
	@When("I click on create button")
	public void i_click_on_create_button() {
		updateAndDelete.clickcreateButton06();
		
	    
	}
	@Then("I click on the edit Icon")
	public void i_click_on_the_edit_icon() {
		updateAndDelete.clickeditOptions07();
	}
	@Then("I enter my new Addresses")
	public void i_enter_my_new_addresses(DataTable dataTables) {
//List<List<String>> addressUp = dataTables.cells();
//		
//		
////		System.out.println(addressIn.get(0).get(0));
//		String upName = addressUp.get(0).get(0);
//		String upAdressed = addressUp .get(0).get(2);
//		String upzipCoded = addressUp .get(0).get(3);
//		String upcitiess = addressUp .get(0).get(4);
//		String upstatess = addressUp .get(0).get(5);
//		String upmNumbers = addressUp .get(0).get(6);
//		updateAndDelete.updatedUserInformation08();
		
		updateAndDelete.updatedUserInformation08();
		
		
	}
	@Then("I click on Update button")
	public void i_click_on_update_button() {
		updateAndDelete.clickupdateButtons09();
	   
	}
	@Then("I click on delete icon")
	public void i_click_on_delete_icon() {
		updateAndDelete.clickdeleteIcons10();
	   
	}
	@Then("I quite browser")
	public void i_quite_browser() {
		updateAndDelete.driverquite11();
	   
	}


}
