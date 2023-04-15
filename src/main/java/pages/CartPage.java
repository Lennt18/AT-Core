package pages;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;

import com.vmo.utils.log.LogHelper;

import webkeywords.WebKeywords;

public class CartPage {
	private WebKeywords action;
	private Logger logger = LogHelper.getLogger();
	List<String> listNameItem = new ArrayList<String>();

//	private String DIV_GROUP_PRODUCTS = "//div[@class='Col__Column-sc-1619uro-0 jSfpxv']/div[2]";
//	private String DIV_PRODUCT = "//div[@class='Col__Column-sc-1619uro-0 jSfpxv']/div[2]/div[@class='CartItems__CartItemsContainer-jDoZuM gtvBSj']";
	private String DIV_NAME_PRODUCT = "//div[@class='MultipleLineClamp__ProductCutoffDot-jCGKBO fMOIos']";

	public CartPage(WebKeywords action) {
		this.action = action;
	}

	/*
	 * public void getNameProduct(String locator) { action.getText(locator); }
	 */

	public List<String> getNameProductsInCart() {
		List<String> productsName = new ArrayList<>();
		productsName = action.getTextItemsOfList(DIV_NAME_PRODUCT);
		logger.info(MessageFormat.format("List name of items in the cart: ''{0}''", productsName));
		return productsName;
	}

	public boolean shouldToBeName() {
		return true;
	}
	/*
	 * public void getListProductInCart() { getNameProductsInCart(); }
	 */
}
