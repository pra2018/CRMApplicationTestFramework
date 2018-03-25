package zoho.CRMAutomationFramework.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	
	
	public void init() {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E://LocalRepo//zohoCRM//CRMAutomationFramework//src//test//java//zoho//CRMAutomationFramework//Config//ProjectConfig.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("url"));
	} 
	// TODO Auto-generated constructor stub




	public WebDriver launchBrowser(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		String s=prop.getProperty("timeunit");
		long a=Integer.parseInt(s);
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
		driver.navigate().to(prop.getProperty("url"));
		return driver;
	}

}
