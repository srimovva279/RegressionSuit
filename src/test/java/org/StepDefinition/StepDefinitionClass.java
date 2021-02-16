package org.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass {
	
	public static WebDriver driver;
	
	@Given("user has to be launch chrome and hit the FB user")
	public void user_has_to_be_launch_chrome_and_hit_the_FB_user() {
	    
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}

	@When("user has to be enter the username and password")
	public void user_has_to_be_enter_the_username_and_password() {
	    
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("hello");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("welcom");
		
	}

	@When("Click the login Button")
	public void click_the_login_Button() {
	    WebElement lonin = driver.findElement(By.id("u_0_b"));
	    lonin.click();
	}

	@Then("user unable to enter the homepage")
	public void user_unable_to_enter_the_homepage() {
	    System.out.println("username to login");
	}
}
