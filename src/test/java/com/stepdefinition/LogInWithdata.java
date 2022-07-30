package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInWithdata extends Base_Class{
	public static WebDriver driver;
	@Given("^user In The Login Page$")
	public void user_In_The_Login_Page() throws Throwable {
		driver=getBrowser("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user Enter valid credentials \"(.*?)\" and \"(.*?)\"$")
	public void user_Enter_valid_credentials_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user navigate to the home page$")
	public void user_navigate_to_the_home_page() throws Throwable {
		boolean status=driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue(status);
	}

}
