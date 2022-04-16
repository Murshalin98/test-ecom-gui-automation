package ecom.stepDefinitions;

import ecom.utils.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase{
	
	@Before("@Admin")
	public void initDriverAdmin() {
		intializeDriverAdmin();
	}
	
	@Before("@User")
	public void initDriver() {
		intializeDriverUser();
	}
	
	@After
	public void tearDown() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
