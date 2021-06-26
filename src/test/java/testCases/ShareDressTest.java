package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.HomePage;
import pageClass.PrintedDress;

public class ShareDressTest extends BaseClass {
	HomePage hp;
	PrintedDress pd;
	
	@Test
	public void shareDress() throws InterruptedException{
		hp = new HomePage(driver);
		hp.moveToPrintedDresses();
		pd = new PrintedDress(driver);
		pd.pinterest.click();
		
		Thread.sleep(3000);
		
	}
	

}
