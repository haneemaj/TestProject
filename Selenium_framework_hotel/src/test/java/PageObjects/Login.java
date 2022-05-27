package PageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	By email = By.name("email");

	By password = By.name("password");

	// By titleText =By.className("barone");

	By login = By.id("login-button");

	public Login(WebDriver driver){

		this.driver = driver;

	}

	//Set user name in textbox

	public void setEmail(String email){

		driver.findElement(By.name("email")).sendKeys(email);

	}

	//Set password in password textbox

	public void setPassword(String password){

		driver.findElement(By.name("password")).sendKeys(password);

	}

	//Click on login button

	public void clickLogin(){

		driver.findElement(By.id("login-button")).click();

	}

	//Get the title of Login Page

	/*
	 * public String getLoginTitle(){
	 * 
	 * return driver.findElement(titleText).getText();
	 * 
	 * }
	 */
	public void quitPage() {
		driver.quit();
	}

}
