package SeleniumTest;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest_Launch {

	public static void main(String[] args) {
		
		
		File file = new File ("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Dinesh%20Shankar/Downloads/userlogin.html");
		
		
//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		
//		Boolean UNexists = username.isDisplayed();
//		Boolean PWDexists = password.isDisplayed();
		
//		//driver.quit();
//		

	}

}
