package pageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccount {
	
	WebDriver driver;
	
    @FindBy(linkText = "My addresses")
    public WebElement btnAddress;
    
    public void myAddress() {
    	
    	btnAddress.click();
    }
}

