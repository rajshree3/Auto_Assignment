package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	 @BeforeMethod
       public void launchUrl() {
	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
  }
	 @AfterMethod
	 public void teardown() {
		 driver.close();
	 }
}