package pageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BaseClass;
import base.BasePage;

public class Addresses extends BasePage{

	public Addresses(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath ="//span[contains(text(),'My addresses')]")
	public WebElement btnAddAddress;
	
	public void addAddress() {
		BaseClass.action = new Actions(driver);
		BaseClass.action.moveToElement(btnAddAddress).build().perform();
		btnAddAddress.click();
	}
}
