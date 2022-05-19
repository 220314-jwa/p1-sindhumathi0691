package StepDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class launch_steps {

	
	@Given("User launch the application")
	public void user_launch_the_application() {
	   
		File file = new File ("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Dinesh%20Shankar/Downloads/userlogin.html");
		
	}

	@Then("User should see Username Password edit box and Signup button")
	public void user_should_see_username_password_edit_box_and_signup_button() {
		
		//WebElement username = driver.findelement(By.name("username"));
		//WebElement password = driver.findElement(By.name("password"));
		
		//Boolean UNexists = username.isDisplayed();
		//Boolean PWDexists = password.isDisplayed();
		
	
	}
	
	
	
}
