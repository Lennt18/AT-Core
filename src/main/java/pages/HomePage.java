package pages;

import org.openqa.selenium.WebDriver;

import drivers.DriverManager;
import webkeywords.WebKeywords;

public class HomePage {
	private WebKeywords action;
	private DriverManager driverManager;

	public HomePage(WebKeywords action) {
		this.action = action;
	}

	public WebDriver getWebDriver() {
		return driverManager.getDriver();
	}
}
