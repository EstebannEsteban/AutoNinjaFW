package com.autoninja.fw.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.autoninja.fw.pagefactory.LoginPF;
import com.autoninja.fw.pagefactory.PolicyDashboardPF;
import com.autoninja.fw.settings.SetBrowser;

public class TestPF extends SetBrowser {

	@Test
	public void CreateNewPolicy() {
		driver.get(appURL);
		LoginPF loginPF = PageFactory.initElements(driver, LoginPF.class);
		PolicyDashboardPF policyDashboardPF = loginPF.LogInApp("ali.cameron",
				"Pond");

		policyDashboardPF.ImpTitle();


	}
}
