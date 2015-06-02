package com.autoninja.fw.tests;

import org.testng.annotations.Test;

import com.autoninja.fw.pages.Login;
import com.autoninja.fw.pages.NewQuote;
import com.autoninja.fw.pages.PolicyDashboard;
import com.autoninja.fw.settings.SetBrowser;

public class Tests extends SetBrowser {

	@Test
	public void CreateNewPolicy() {
		driver.get(appURL);
		Login login = new Login(driver);
		PolicyDashboard policyDashboard = login
				.LogInApp("amanda.poole", "Pond");
		policyDashboard.ImpTitle();
		NewQuote newQuote = policyDashboard.CreateNewQuote();



	}
}
