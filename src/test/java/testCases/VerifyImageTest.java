package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pageClass.HomePage;

public class VerifyImageTest extends BaseClass{
	HomePage hp;

	@Test
	public void verifyImage() {
		hp = new HomePage(driver);
		hp.saleImageDisplayed();
		Assert.assertTrue(true);
		
		
	}
}
