package zoho.CRMAutomationFramework.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zoho.CRMAutomationFramework.Utilities.Base;
import zoho.CRMAutomationFramework.objectRepository.Login;

public class LoginTest extends Base{

	@BeforeMethod
	public void setup(){
		super.init();
		driver=launchBrowser();
	}
	@Test
	public void zohoCRMLogin(){
		Login login=new Login(driver);
		login.doLogin(prop.getProperty("userId"),prop.getProperty("appPassword"));
		Assert.assertEquals(login.getPageTitle(), "Zoho"); 
}
	 
	
}
