package com.autoninja.fw.settings;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class SetBrowser {

	public WebDriver driver;
	public String appURL;

	@BeforeMethod()
	@Parameters({ "browser", "appURL" })
	public void launchBrowser(
			@Optional("FIREFOX") String browser,
			@Optional("http://10.130.16.198:8080/Express43/default.aspx") String appURL) {

		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					"C://chromedriver//chromedriver.exe");
			// System.setProperty("webdriver.chrome.driver",
			// "C://esteban_ibarguen_mod0.jar//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
		this.appURL = appURL;

	}

	@AfterMethod
	public void closeBrowser(ITestResult result) throws IOException {

		if (!result.isSuccess()) {
			File imageFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			String failureImageFileName = result.getMethod().getMethodName()
					+ new SimpleDateFormat("MM-dd-yyyy_HH-ss")
							.format(new GregorianCalendar().getTime()) + ".png";
			File failureImageFile = new File(failureImageFileName);
			FileUtils.moveFile(imageFile, failureImageFile);
		}
		driver.close();
		driver.quit();
	}

}
