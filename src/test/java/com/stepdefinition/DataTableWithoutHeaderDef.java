package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderDef extends Base_Class {
	public static WebDriver driver;
	@Given("^you are In The Login Page$")
	public void you_are_In_The_Login_Page() throws Throwable {
		driver=getBrowser("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^you Enter valid credentials$")
	public void you_Enter_valid_credentials(DataTable DataTable) throws Throwable {
		List<String> credentials = DataTable.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^you click the login button$")
	public void you_click_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}
}
