package pages;

import java.text.MessageFormat;

import org.slf4j.Logger;
import com.vmo.utils.log.LogHelper;
import webkeywords.WebKeywords;

public class ProductDetail {
	private WebKeywords action;
	private Logger logger = LogHelper.getLogger();

	private String SPAN_BRAND_NAME_PRODUCT = "//div[@class='Padding-sc-10o2jvk-0 gcrEuw']//a[@id='link-brandName-productDetail']/span";
	private String SPAN_NAME_PRODUCT = "//div[@class='Padding-sc-10o2jvk-0 gcrEuw']//span[@id='lbl-productName-productDetail']";

	private String BTN_ADD_CART = "//div[@class='Col__Column-sc-1619uro-0 bWadEp']//div[@class='Row__Wrapper-v6uxgu-0 kSLyDU']//div[@class='Col__Column-sc-1619uro-0 cPDxnm']//div//button";

	// has a
//	Header objHeader;

	public ProductDetail(WebKeywords action) {
		this.action = action;
	}

	public String getNameProduct() {
		String productBrand = action.getText(SPAN_BRAND_NAME_PRODUCT);
		String productName = action.getText(SPAN_NAME_PRODUCT);
		String fullNameProduct = productBrand + productName;
		logger.info(MessageFormat.format("Full Name of item in ProductPage in order to add cart: ''{0}''",
				fullNameProduct));
		return fullNameProduct;
	}

	public void clickAddCart() {
		action.click(BTN_ADD_CART);
	}
	/*
	 * public void getListProductInProductPage() { getNameProduct(); }
	 */
}
