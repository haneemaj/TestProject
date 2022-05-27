package Core;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import PageObjects.Login;


public class Base_setup {

	String driverPath = "C:/Users/Vishnu/eclipse-workspace/Selenium_framework_hotel/drivers/chromedriver.exe";

	WebDriver driver;

	Login objLogin;


	@BeforeTest

	public void setup(){

		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://hotel.testplanisphere.dev/ja/login.html");
		driver.manage().window().maximize();

	}

	@Test
	public void TC_Login_to_the_site(){

		objLogin = new Login(driver);
		objLogin.setEmail("ichiro@example.com");
		objLogin.setPassword("password");
		objLogin.clickLogin();
		objLogin.quitPage();
	}
}
