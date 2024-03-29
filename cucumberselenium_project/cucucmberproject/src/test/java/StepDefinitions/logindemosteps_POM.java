package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginpage;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class logindemosteps_POM {
	WebDriver driver =null;
	loginpage login;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("inside step - browser is open");
		
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath is: "+projectpath);
		
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		
	  driver.navigate().to("https://testproject.io/web-test-recorder/"); 
	   driver.navigate().to("https://app.testproject.io");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password)  {
		
		loginpage login=new loginpage(driver);
		
		login.enterusername(username);
		
		
		login.enterpassword(password);
	  // driver.findElement(By.id("username")).sendKeys(username);
	 //  driver.findElement(By.id("password")).sendKeys(password);
	   
	}
	@And ("user clicks on login")
	public void user_clicks_on_login() {
		login.clickLogin();
	  //  driver.findElement(By.id("tp-sign-in")).click();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	//	login.checkLogoutIsDisplayed();
		//driver.findElement(By.id("+New Test")).isDisplayed();
		driver.close();
		driver.quit();
	    
	}
}

