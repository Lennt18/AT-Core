package com.vmo.listener;

import org.testng.ITestNGListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.vmo.utils.configs.ConfigSettings;

import webkeywords.WebKeywords;

public class TestNGListener implements ITestNGListener {
	protected WebKeywords action;
	
	private ConfigSettings configSettings;
	
	public TestNGListener() {
		action = new WebKeywords();
		configSettings = new ConfigSettings(System.getProperty("user.dir"));
	}
	
	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browser) {
		action.openBrowser(browser, configSettings.getPowerBuyUrl());
	}

	@AfterTest
	public void afterTest() {
		//action.closeBrowser(configSettings.getPowerBuyUrl());
	}
}
