package com.autoninja.fw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PolicyDashboard {
	WebDriver driver;

	public PolicyDashboard(WebDriver driver) {
		this.driver = driver;
	}

	public void ImpTitle(){
		
		System.out.println(driver.getTitle());
	}

	public NewQuote CreateNewQuote() {
		driver.findElement(By.linkText("New Quote")).click();
		return new NewQuote(driver);
	}
	
	public Logout clickLogout(){
	driver.findElement(By.linkText("Logout")).click();
		return new Logout(driver);
	}
	

}
