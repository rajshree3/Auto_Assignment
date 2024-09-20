package pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class amazon_pom {
	
	WebDriver driver;

	@FindBy(how=How.ID, using="twotabsearchtextbox")
	private WebElement searchBar;
	
	@FindBy(how=How.ID, using ="nav-search-submit-button")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="(//img[@class='_bXVsd_image_iVomf'])[3]")
	private WebElement selCal;
	
	@FindBy(how=How.ID, using="nav-logo-sprites")
	private WebElement vrysite;
	
	@FindBy(how=How.XPATH, using="//span[text()='1-16 of over 2,000 results for']")
	private WebElement calci;
	
	@FindBy(how=How.XPATH, using="//input[@id='add-to-cart-button']")
	private WebElement addCart;
	
	@FindBy(how=How.XPATH, using="(//input[@type='submit'])[2]")
	private WebElement skipbtn;
	
	@FindBy(how=How.XPATH, using="//div[@class='a-fixed-left-grid']")
	private WebElement itemCart;
	
	public WebElement getItemCart() {
		return itemCart;
	}

	public WebElement getSkipbtn() {
		return skipbtn;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public WebElement getCalci() {
		return calci;
	}

	public WebElement getVrysite() {
		return vrysite;
	}
	
	public WebElement getSelCal() {
		return selCal;
	}
	
	public amazon_pom(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getSearchBar() {
		return searchBar;
	}
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}

	
	
}
