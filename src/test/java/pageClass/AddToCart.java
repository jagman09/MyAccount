package pageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BaseClass;
import base.BasePage;

public class AddToCart extends BasePage {

	public AddToCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	public WebElement clickOnDresses;

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement moveToDresses;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	public WebElement clickaddToCart;

	public void clickDresses() {
		BaseClass.action = new Actions(driver);
		BaseClass.action.moveToElement(moveToDresses).build().perform();
		clickOnDresses.click();
	}
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]" )
	public WebElement btnAddToCart;

	
	 public void addToCart() {
	 BaseClass.action = new Actions(driver);
	 action.moveToElement(btnAddToCart).build().perform(); clickaddToCart.click(); 
	 
	  }
	
	 

}
