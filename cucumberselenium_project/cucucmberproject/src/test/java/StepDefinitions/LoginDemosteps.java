package StepDefinitions;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
////import io.cucumber.java.en.Then;
////import io.cucumber.java.en.When;
//
//public class LoginDemosteps {
//	WebDriver driver =null;
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//		System.out.println("inside step - browser is open");
//		
//		String projectpath = System.getProperty("user.dir");
//		System.out.println("projectpath is: "+projectpath);
//		
//		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//		
//	    
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	   driver.navigate().to("https://testproject.io/web-test-recorder/"); 
//	driver.navigate().to("https://app.testproject.io");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password)  {
//	   driver.findElement(By.id("username")).sendKeys(username);
//	   driver.findElement(By.id("password")).sendKeys(password);
//	   
//	}
//	@And ("user clicks on login")
//	public void user_clicks_on_login() {
//	    driver.findElement(By.id("tp-sign-in")).click();
//	}
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() {
//		driver.findElement(By.id("+New Test")).isDisplayed();
//		driver.close();
//		driver.quit();
//	    
//	}
//}
