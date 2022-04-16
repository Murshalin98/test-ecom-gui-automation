package ecom.stepDefinitions;

import java.util.List;

import ecom.pages.AdminAddProductPOM;
import ecom.utils.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAddProductSteps extends TestBase {
	
	AdminAddProductPOM adminAddProductPOM;
	
	@When("I click on the products button")
	public void i_click_on_the_products_button() {
		adminAddProductPOM= new AdminAddProductPOM();
		adminAddProductPOM.clickOnProductButton();
	}
	@When("I click on the create product")
	public void i_click_on_the_create_product() {
		adminAddProductPOM.clickOnCreateProductButton();
	}
	
	
	  @When("I enter the product information and price") public void
	  i_enter_the_product_information_and_price(DataTable dataTable) { List
	  <List<String>> productInfo= dataTable.cells();
	  
	  System.out.println(productInfo.get(0).get(0));
	 // System.out.println(productInfo.get(0).get(1));
	  System.out.println(productInfo.get(0).get(1));
	  System.out.println(productInfo.get(0).get(2));
	  
	  String name= productInfo.get(0).get(0); 
	 // String category= productInfo.get(0).get(1); 
	  String unit= productInfo.get(0).get(1); 
	  String price= productInfo.get(0).get(2);
	  
	  adminAddProductPOM.enterProductInformation(name, unit, price); }
	 
	
	@When("I add product image")
	public void i_add_product_image() {
		adminAddProductPOM= new AdminAddProductPOM();
		adminAddProductPOM.uploadProductImage();
		
	}
	
	@When("I turn off free shipping option")
	public void i_turn_off_free_shipping_option() {
		adminAddProductPOM= new AdminAddProductPOM();
		adminAddProductPOM.clickOnShippingOptionButton();
	}
	
	@When("I click on save product button")
	public void i_click_on_save_product_button() {
		adminAddProductPOM= new AdminAddProductPOM();
		adminAddProductPOM.clickOnSaveProductButton();
	}
	
	@Then("I should add a product successfully")
	public void i_should_add_a_product_successfully() {
		adminAddProductPOM= new AdminAddProductPOM();
		adminAddProductPOM.assertAddProduct();
	}

}
