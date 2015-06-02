package com.autoninja.fw.pagefactory;

import org.openqa.selenium.WebDriver;

public class PolicyDashboardPF {
	WebDriver driver;

	public PolicyDashboardPF(WebDriver driver) {
		this.driver = driver;
	}

	public void ImpTitle(){
		
		System.out.println(driver.getTitle());
	}


	

}
