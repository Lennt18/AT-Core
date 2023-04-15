package com.vmo.test;

import webkeywords.WebKeywords;

public class Test {
	public WebKeywords action;

	private String A_LANG_ENG = "//a[@id='lnk-setLanguageDesktop-en']";
	private String DIV_SIZE_FILTER = "//div[@class='CardCollaspe__TitleAndBadge-sc-1jxh92o-6 kwYXNQ'][normalize-space()='Screen Size Group (inches)']";
	private String INPUT_SEARCH = "//div[@class='MainHeader__SearchContainer-ezhahy iqrizX']//input[@id='txt-searchBox-input']";

	public void Test() {
		action.openBrowser("https://www.powerbuy.co.th/th/.");
		action.click(A_LANG_ENG);
		action.setText(INPUT_SEARCH, "TV");
		action.scrollToElement(DIV_SIZE_FILTER);
	}
}
