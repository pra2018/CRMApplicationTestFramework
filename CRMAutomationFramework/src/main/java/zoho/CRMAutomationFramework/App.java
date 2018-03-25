package zoho.CRMAutomationFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FileInputStream fis = null;
		try {
			fis = new FileInputStream("E://MyWorkSpace//CRMAutomationFramework//src//test//java//zoho//CRMAutomationFramework//Config//ProjectConfig.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println(prop.getProperty("url"));
	} 
    }

