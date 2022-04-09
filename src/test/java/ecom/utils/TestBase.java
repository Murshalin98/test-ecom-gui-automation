package ecom.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	//Instance variables
	public static WebDriver driver;
	public static Properties prop;
	
	
	//load the properties file
	public TestBase() {
		
		try {
		prop= new Properties();
		
		FileInputStream inputProperties= new FileInputStream(
				"C:\\Users\\Murshalin\\Downloads\\ecom.automation2\\ecom.automation2\\src\\test\\java\\ecom\\config\\config.properties");
		
		prop.load(inputProperties);
		
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Driver initialization
	public static void intializeDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if (browserName.equals("chrome")) {
			driver= new ChromeDriver();
		}else if (browserName.equals("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Driver's information is not valid");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("baseURL"));
		
		
	}
	
	
	
	
	
	

}
