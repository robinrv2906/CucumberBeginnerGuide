package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDef extends Base_Class{
	public static WebDriver driver;
	@Given("^User is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		driver=getBrowser("chrome");
		driver=getUrl("https://www.google.co.in/?gws_rd=ssl");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
	driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^user should see the search result$")
	public void user_should_see_the_search_result() throws Throwable {
		boolean status = driver.findElement(By.partialLinkText("Agni")).isDisplayed();
		if (status) {
			System.out.println("Result displyed");
		}
	}

}
