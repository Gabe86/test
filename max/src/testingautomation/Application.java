package testingautomation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Application extends SetUpBase{
	 
	@Test
	public void apply() throws InterruptedException {
	//apply button select
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//FNAME
	wait.until(ExpectedConditions.elementToBeClickable(By.name("data[FirstName]"))).click();
	WebElement name=driver.findElement(By.name("data[FirstName]"));
	name.sendKeys("Alex");
	//lname
	WebElement lastName=driver.findElement(By.name("data[LastName]"));
	lastName.sendKeys("Smith");
	//zip
	WebElement zip=driver.findElement(By.name("data[ZipCode]"));
	zip.sendKeys("60707");
	//school
	WebElement dropDown = driver.findElement(By.name("data[School]"));;
	dropDown.click();
	Thread.sleep(5000);
	List<WebElement> classlist = driver.findElements(By.className("school-select-items"));;
	classlist.get(0).click();
	WebElement schoolEmail=driver.findElement(By.name("data[Email]"));
	schoolEmail.sendKeys("testschool24@gmail.com");
	WebElement createPassword=driver.findElement(By.name("data[Password]"));
	createPassword.sendKeys("password1");
	WebElement submit=driver.findElement(By.id("register-button"));
	submit.click();
	Thread.sleep(5000);
   

	 
  
		
	}
	
}
