package ecom.stepDefinitions;

import ecom.pages.BuyerSupportChatPOM;
import ecom.utils.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyerSupportChatSteps extends TestBase {
	
	BuyerSupportChatPOM buyerSupportChatPOM;
	
	@When("I click on the chat icon")
	public void i_click_on_the_chat_icon() {
		buyerSupportChatPOM= new BuyerSupportChatPOM();
		buyerSupportChatPOM.clickOnChatIcon();
	}
	
	@When("I click in the compose message box")
	public void i_click_in_the_compose_message_box() {
		buyerSupportChatPOM= new BuyerSupportChatPOM();
		buyerSupportChatPOM.clickOnMessageBox();
	}
	
	@When("I type the query")
	public void i_type_the_query() {
		buyerSupportChatPOM= new BuyerSupportChatPOM();
		buyerSupportChatPOM.typeMessage();
	}
	
	@When("I click send icon")
	public void i_click_send_icon() {
		buyerSupportChatPOM= new BuyerSupportChatPOM();
		buyerSupportChatPOM.clickOnSendIcon();
	}
	
	@Then("Message should have sent successfully")
	public void message_should_have_sent_successfully() {
		buyerSupportChatPOM= new BuyerSupportChatPOM();
		buyerSupportChatPOM.assertChat();
	}

}
