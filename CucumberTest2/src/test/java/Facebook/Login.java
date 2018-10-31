package Facebook;

import static org.testng.Assert.assertEquals;

import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Login {
	WebDriver driver = new ChromeDriver();
	String baseURL = "https://www.facebook.com/";
	@Given("^Browser is Started$")
	public void browser_is_Started() throws Throwable {
		System.out.println("Starting the browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get(baseURL);
		driver.manage().window().maximize();
	}

	@And("^User is on Facebook page$")
	public void user_is_on_Facebook_page() throws Throwable {
		System.out.println("Checking if user is on homepage");
		String ExpectedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		System.out.println("Actual title of the page is "+ActualTitle);
	    assertEquals(ExpectedTitle, ActualTitle);
	}

	@Then("^Login button should be visible and clickable$")
	public void login_button_should_be_visible_and_clickable() throws Throwable {
		WebElement login = driver.findElement(By.id("u_0_3"));
		if(login.isDisplayed());
	    Log.info("Login button is displayed");
	    if(login.isEnabled());
	    Log.info("Login is clickable");	  
	}

	@Given("^User is on Facebook page already$")
	public void user_is_on_Facebook_page_already() throws Throwable {
		String ExpectedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
	    assertEquals(ExpectedTitle,ActualTitle);
	    Log.info("User is on homepage");
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		WebElement login = driver.findElement(By.id("u_0_3"));
		login.click();	   
	}

	@Then("^User should be taken to login page$")
	public void user_should_be_taken_to_login_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,10);
		String ExpectedTitle= "Log in to Facebook";
		String ActualTitle=driver.getTitle();
		assertEquals(ExpectedTitle,ActualTitle);
		Log.info("User is on the login page");
	}
}
/*
	@Given("^User gives valid user name and password$")
	public void user_gives_valid_user_name_and_password() throws Throwable {
	   
	    throw new PendingException();
	}

	@And("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
	
	    throw new PendingException();
	}

	@Then("^User should be taken to homepage$")
	public void user_should_be_taken_to_homepage() throws Throwable {
	  
	    throw new PendingException();
	}

}
*/