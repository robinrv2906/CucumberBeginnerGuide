package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExampleDef extends Base_Class {
	public static WebDriver driver;
	
	@Given("^Go To Log In Page$")
	public void go_To_Log_In_Page() throws Throwable {
		driver = getBrowser("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Enter \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_and_password(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^click  login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}



}
