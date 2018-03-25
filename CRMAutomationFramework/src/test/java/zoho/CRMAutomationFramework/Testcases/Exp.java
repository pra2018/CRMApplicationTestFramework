package zoho.CRMAutomationFramework.Testcases;

import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zoho.CRMAutomationFramework.Utilities.Base;

public class Exp extends Base {
Properties p;
	@BeforeTest
	public void setup(){
		init();
		
	}
	@Test
	public void exptest(){
		System.out.println(p.getProperty("url"));
	}

}
