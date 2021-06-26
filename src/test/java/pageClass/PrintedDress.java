package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class PrintedDress extends BasePage{

	public PrintedDress(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/p[7]/button[4]")
		public WebElement pinterest;
		
		public void clickPinterest() {
		pinterest.click();
	}
		

}
