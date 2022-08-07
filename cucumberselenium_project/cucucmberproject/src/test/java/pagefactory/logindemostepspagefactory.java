package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logindemostepspagefactory {
	
  @FindBy(id="username")
  WebElement txt_username;

  @FindBy(id="password")
  WebElement txt_password;

  @FindBy(id="login")
  WebElement btn_login;
  
  public logindemostepspagefactory(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, logindemostepspagefactory.class);
  }
  
  public void enterUsername(String username) {
	  txt_username.sendKeys(username);
	  
  }
  
  public void enterPassword(String password) {
	  txt_password.sendKeys(password);
  }
public void clickOnLogin() {
	btn_login.click();
}
}
