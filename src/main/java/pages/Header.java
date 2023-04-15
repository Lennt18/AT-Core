package pages;

import webkeywords.WebKeywords;

public class Header {
	private WebKeywords action;

	private String A_LANG_ENG = "//a[@id='lnk-setLanguageDesktop-en']";
	private String INPUT_SEARCH = "//div[@class='MainHeader__SearchContainer-ezhahy iqrizX']//input[@id='txt-searchBox-input']";

	private String DIV_CART = "//div[@class='MainHeader__MiniCartContainer-cOzool KbPez']";

	public Header(WebKeywords action) {
		this.action = action;
	}

	public void choseLanguage() {
		action.dismissAlert();
		action.click(A_LANG_ENG);
	}

	public void Search(String contentSearch) {
		action.setText(INPUT_SEARCH, contentSearch);
	}

	public void clickVeiwCart() {
		action.click(DIV_CART);
	}
}
