package Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass;
import net.bytebuddy.utility.RandomString;
import pom.com.amazon_pom;

public class Amazon_Test extends BaseClass{

		
@Test	
	public void AmazonSite() throws Exception{
		
		amazon_pom amazon= PageFactory.initElements(driver, amazon_pom.class);
		
        //verifying user land on the amazon site
        
		String logotext=amazon.getVrysite().getText();
	    System.out.println(logotext);
	  	Assert.assertEquals(logotext, ".in");
		
	  	// Searching for the calculators
	  	System.out.println("User can view the Home page");
	  	amazon.getSearchBar().sendKeys("Calculator");
		amazon.getSearchBtn().click();
		
		//Verifying calculator page is searched
		String calciText=amazon.getCalci().getText();
		System.out.println(calciText);		
	    Assert.assertEquals(calciText, "1-16 of over 2,000 results for");
		
		//Clicking on the Calculator
		
		amazon.getSelCal().click();
		
		//adding the item to the card
		amazon.getAddCart().click();
		Actions act= new Actions(driver);
		WebElement skip=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		Thread.sleep(5000);
	    act.moveToElement(skip).click().build().perform();
		//amazon.getSkipbtn().click();
		
		
		//Verifying the item is added to the cart
	    String cardAdded=amazon.getItemCart().getText();
		System.out.println(cardAdded);
		
		System.out.println("item added to the card successfully");
		
		String rm=RandomString.make(2);
		TakesScreenshot sh = (TakesScreenshot) driver;
		File scrFile= sh.getScreenshotAs(OutputType.FILE);
		File destFile= new File("D:\\eclipse 2023-12\\Auto_Assignment\\screenshot"+"\\"+rm+".png");
		FileUtils.copyFile(scrFile, destFile);
		System.out.println("Screenshot saved successfully.");
		
		
		
		
		
		
}
	
}
