package pageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BaseClass;
import base.BasePage;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Sign in")
	public WebElement btnSignIn;
	public void signInClick() {
		btnSignIn.click();
	}
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/img[1]")
	public WebElement imgSale;
	public void saleImageDisplayed() {
		imgSale.isDisplayed();
	}
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
	public WebElement iconPrintedDresses;
	
	@FindBy(linkText = "More")
	public WebElement btnMore;
	
	public void moveToPrintedDresses() {
		BaseClass.action = new Actions(driver);
		action.moveToElement(iconPrintedDresses).build().perform();
		btnMore.click();
	}

} 
