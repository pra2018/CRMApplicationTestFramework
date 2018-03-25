package zoho.CRMAutomationFramework.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(id="lid")
	private WebElement user;
	@FindBy(id="pwd")
	private WebElement pwd;
	@FindBy(id="signin_submit")
	private WebElement submit;
	
	
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	public void setuserName(String usr){
	user.sendKeys(usr);
	}
	
	public void setPassword(String password){
		pwd.sendKeys(password);
		}
	public void clickLogin(){
		submit.click();
		}
	
	public void doLogin(String userName,String password){
	this.setuserName(userName);
	this.setPassword(password);
	this.clickLogin();
	
	}
	
	
	
  
}
