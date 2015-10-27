package testingautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;


public class SetUpBase extends SeleneseTestBase {
 

	static WebDriver driver;

	static Selenium selenium;
	

	
	
	

  @BeforeClass
  public void beforeClass() throws InterruptedException {
 
  
	  System.setProperty("webdriver.chrome.driver","//Applications//Google//chromedriver");
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  String baseUrl = "http://www.mobymax.com/";
	  driver.get(baseUrl); 
	  selenium = new WebDriverBackedSelenium(driver,baseUrl);




		
		
		}
	  


  @AfterClass
  public void afterClass() {
  
	  driver.quit();
  
  
  
  }

  

}
