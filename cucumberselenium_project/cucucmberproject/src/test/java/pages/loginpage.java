package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
private By txt_username =By.id("username");
private By txt_password =By.id("password");
 private By btn_login=By.id("tp-sign-in");
private By btn_logout=By.id("logout"); 

 public loginpage(WebDriver driver) {
	 this.driver=driver;
	 if(!driver.getTitle().equals("TestProjectDemo"));
	 throw new IllegalStateException("ThIS IS NOT LOGIN PAGE. The current page is " +driver.getCurrentUrl());
 }
public void enterusername(String username) {
driver.findElement(txt_username).sendKeys(username);
}

public void enterpassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
}
public void clickLogin() {
	driver.findElement(btn_login).click();
}
public void checkLogoutIsDisplayed() {
	driver.findElement(btn_logout).isDisplayed();
}
public void loginValiduser(String username, String password) {
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);
	driver.findElement(btn_login).click();
}
}
