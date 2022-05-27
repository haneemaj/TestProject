import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class Hotelhome {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users/Vishnu/eclipse-workspace/Selenium_framework_hotel/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://hotel.testplanisphere.dev/ja/login.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ichiro@example.com");
		
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
		
		
		 boolean t = driver.findElement(By.xpath("//*[@id='email']")).isDisplayed();
		 if (t) {
	         System.out.println("Element is dispalyed as ichiro@example.com");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
		driver.quit();
	}
	
	
}
