package com.autoninja.fw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewQuote {

	WebDriver driver;

	public NewQuote(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		System.out.println(driver
.findElement(By.id("Home")).getText());
	}
}
