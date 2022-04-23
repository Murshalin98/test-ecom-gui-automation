package ecom.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	//Instance variables
	public static WebDriver driver;
	public static Properties prop;
	
	
	//load the properties file
	public TestBase() {
		
		try {
		prop= new Properties();
		
		FileInputStream inputProperties= new FileInputStream("./src/test/java/ecom/config/config.properties");
		
		prop.load(inputProperties);
		
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Driver initialization
	public static void intializeDriverAdmin() {
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Driver's information not found");
        }
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("adminURL"));
	}
	
	//Driver initialization
		public static void intializeDriverUser() {
			WebDriverManager.firefoxdriver().setup();
			WebDriverManager.chromedriver().setup();
			WebDriverManager.edgedriver().setup();
			
			String browserName=prop.getProperty("browser");
			
			if (browserName.equals("firefox")) {
	            driver = new FirefoxDriver();
	        } else if (browserName.equals("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browserName.equals("edge")) {
	            driver = new EdgeDriver();
	        } else {
	            System.out.println("Driver's information not found");
	        }
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("baseURL"));
		}
	
		
		//  Dynamic Methods
		//Click Element through JS
	    public void clickElementByJS(WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", element);
	    }

	    //Send keys by Id through JS
	    public void sendKeysUsingWithId(String id, String value) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
	    }

	    //Get Title by JS
	    public String getTitleByJS() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        return js.executeScript("return document.title;").toString();
	    }

	    public static WebDriver getDriver(){
	        return driver;
	    }

	    public void clickOn(By locator) {
	        getDriver().findElement(locator).click();

	    }

	    public void setValue(By locator, String value) {
	        getDriver().findElement(locator).sendKeys(value);

	    }


	    public boolean IsElementDisplayed(By locator) {


	        boolean IsDisplayed;

	        try {
	            IsDisplayed = getDriver().findElement(locator).isDisplayed();
	        } catch (NoSuchElementException e) {
	            IsDisplayed = false;

	        }
	        return IsDisplayed;

	    }

	    public void selectByValueFromDropDown(By locator, String value) {
	        WebElement dropDwonElement = getDriver().findElement(locator);
	        Select dropDown = new Select(dropDwonElement);
	        dropDown.selectByValue(value);
	    }


	    public By getBy(String locatorType, String locatorValue) {
	        By locator = null;

	        switch (locatorType.toLowerCase()) {
	            case "id":
	                locator = By.id(locatorValue);
	                break;
	            case "name":
	                locator = By.name(locatorValue);
	                break;
	            case "classname":
	                locator = By.className(locatorValue);
	                break;
	            case "xpath":
	                locator = By.xpath(locatorValue);
	                break;
	            case "cssselector":
	                locator = By.cssSelector(locatorValue);
	                break;
	            case "linktext":
	                locator = By.linkText(locatorValue);
	                break;

	            default:
	                System.out.println("please pass the right locator type and value.....");
	                break;
	        }

	        return locator;

	    }

	    public WebElement doPresenceOfElementLocated(By locator, int timeOut) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	    }

	    public void doSendKeys(By locator, String value, int timeOut) {
	        doPresenceOfElementLocated(locator, timeOut).sendKeys(value);
	    }
}
