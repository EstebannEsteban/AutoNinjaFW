package com.autoninja.fw.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autoninja.fw.settings.SetBrowser;

public class LoginPF extends SetBrowser {

	WebDriver driver;
	private String usernameString;
	private String passwordString;

	@FindBy(id = "username")
	WebElement txtUserNameElement;

	@FindBy(id = "password")
	WebElement txtPasswordElement;

	@FindBy(linkText = "Login")
	WebElement btnLoginElement;

	public LoginPF(WebDriver driver) {
		this.driver = driver;
	}


	public PolicyDashboardPF LogInApp(String usernameString,
			String passwordString) {
		setUsernameString(usernameString);
		setPasswordString(passwordString);
		clickLoginBtn();
		return PageFactory.initElements(driver, PolicyDashboardPF.class);
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
		txtUserNameElement.sendKeys(usernameString);
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
		txtPasswordElement.sendKeys(passwordString);
		this.passwordString = passwordString;
	}

	public void clickLoginBtn() {
		btnLoginElement.click();

	}
}
