package pages;

import webkeywords.WebKeywords;

public class ResultPage {
	private WebKeywords action;

	private String SPAN_PRODUCT1 = "//div[@class='AlgoliaSearchResultDesktop__ProductsWrapper-hfzkvY ifmKXt']//div[@class='Col__Column-sc-1619uro-0 dMKlyR'][8]//div/h3/a[2]/span";
	private String DIV_PRODUCT1BEFORE = "//div[@class='AlgoliaSearchResultDesktop__ProductsWrapper-hfzkvY ifmKXt']//div[@class='Col__Column-sc-1619uro-0 dMKlyR'][5]";
	private String SPAN_PRODUCT2 = "//div[@class='AlgoliaSearchResultDesktop__ProductsWrapper-hfzkvY ifmKXt']//div[@class='Col__Column-sc-1619uro-0 dMKlyR'][8]//div/h3/a[2]/span";
	private String DIV_PRODUCT2BEFORE = "//div[@class='AlgoliaSearchResultDesktop__ProductsWrapper-hfzkvY ifmKXt']//div[@class='Col__Column-sc-1619uro-0 dMKlyR'][5]";

	public ResultPage(WebKeywords action) {
		this.action = action;
	}

	public void getProduct() {
		action.scrollToElement(SPAN_PRODUCT1);
		action.click(SPAN_PRODUCT1);
	}
}
