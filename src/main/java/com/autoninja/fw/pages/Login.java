package com.autoninja.fw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.autoninja.fw.settings.SetBrowser;

public class Login extends SetBrowser {

	WebDriver driver;
	private String usernameString;
	private String passwordString;

	public Login(WebDriver driver) {
		this.driver = driver;
	}


	public PolicyDashboard LogInApp(String usernameString, String passwordString) {
		setUsernameString(usernameString);
		setPasswordString(passwordString);
		clickLoginBtn();
		return new PolicyDashboard(driver);
	}

	/**
	 * @return the usernameString
	 */
	String getUsernameString() {
		return usernameString;
	}

	/**
	 * @param usernameString the usernameString to set
	 */
	void setUsernameString(String usernameString) {
		driver.findElement(By.id("username")).sendKeys(usernameString);
		this.usernameString = usernameString;
	}

	/**
	 * @return the passwordString
	 */
	String getPasswordString() {
		return passwordString;
	}

	/**
	 * @param passwordString the passwordString to set
	 */
	void setPasswordString(String passwordString) {
		driver.findElement(By.id("password")).sendKeys(passwordString);
		this.passwordString = passwordString;
	}

	public void clickLoginBtn() {
		driver.findElement(By.linkText("Login")).click();

	}
}
