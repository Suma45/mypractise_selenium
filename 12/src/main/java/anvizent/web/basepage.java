package anvizent.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class basepage {

	
	WebDriver driver;
	


   @FindBy(how=How.ID, using="auth_clientid")
   public WebElement clientID;
   
   @FindBy(how=How.ID, using="auth_user")
   public WebElement userName;
   
   @FindBy(how=How.ID, using="auth_pwd")
   public WebElement password;
   
   @FindBy(how=How.ID, using="loginBtn")
   public WebElement loginBtn;
   
   @FindBy(how=How.XPATH, using="//a[contains(text(),'Launch')]")
   public WebElement launchLink;
   
   
   @FindBy(how=How.XPATH, using="//a[contains(text(),'New Dashboard')]")
   public WebElement newDashboard;
   
   @FindBy(how=How.ID, using ="getDataSourceDetails")
   public WebElement getBtn;
   
   @FindBy(how=How.ID, using ="Reports Subscription")
   public WebElement ReportsSub;
   
   @FindBy(how=How.ID, using="dropdownMenuButton")
   public WebElement userProfile;
   
   
   @FindBy(how=How.XPATH, using="//span[contains(text(),'Logout')]")
   public WebElement logOut;
   
}