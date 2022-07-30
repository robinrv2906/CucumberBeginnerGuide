package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeaderDef extends Base_Class {
	public static WebDriver driver;

	@Given("^Go To Login Page$")
	public void go_To_Login_Page() throws Throwable {
		driver = getBrowser("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Enter valid credentials$")
	public void enter_valid_credentials(DataTable dataTable) throws Throwable {

		List<Map<String, String>> credential = dataTable.asMaps(String.class, String.class);
		String username = credential.get(0).get("userName");
		String password = credential.get(0).get("password");

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}
}
