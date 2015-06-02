package com.autoninja.fw.pages;

import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;

	public Logout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		System.out.println(driver.getTitle());
	}
}
