package com.vmo.test;

import org.slf4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vmo.listener.TestNGListener;
import com.vmo.utils.configs.ConfigSettings;
import com.vmo.utils.log.LogHelper;

import pages.CartPage;
import pages.FilterMenu;
import pages.Header;
import pages.HomePage;
import pages.ProductDetail;
import pages.ResultPage;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class DemoTest extends TestNGListener {
	private static Logger logger = LogHelper.getLogger();

	private HomePage homePage;
	private CartPage cartPage;
	private Header header;
	private ResultPage resultPage;
	private FilterMenu filterMenu;
	private ProductDetail productDetail;

	List<String> listNameProductAdded = new ArrayList<String>();
	List<String> listProductInCart = new ArrayList<String>();

	@Parameters("browser")
	@Test
	public void Test_01() throws Throwable {
		header = new Header(action);
		homePage = new HomePage(action);
		filterMenu = new FilterMenu(action);
		cartPage = new CartPage(action);
		productDetail = new ProductDetail(action);
		resultPage = new ResultPage(action);

		Thread.sleep(3000);

		header.choseLanguage();
		header.Search("TV");
		action.acceptAlert();

		filterMenu.FilterSearch("44 - 55 inches");
		/*
		 * resultPage.getProduct();
		 * listNameProductAdded.add(productDetail.getNameProduct());
		 * productDetail.clickAddCart();
		 * 
		 * action.back();
		 */

		/*
		 * Thread.sleep(300); filterMenu.FilterSearch("56 - 65 inches");
		 * resultPage.getProduct02();
		 * listNameProductAdded.add(productDetail.getNameProduct());
		 * productDetail.clickAddCart();
		 */

		/*
		 * header.clickVeiwCart();
		 * 
		 * Thread.sleep(20000); listProductInCart = cartPage.getNameProductsInCart();
		 * 
		 * logger.info("listProductInCart: " + listProductInCart);
		 * logger.info("listNameProductAdded: " + listNameProductAdded);
		 * 
		 * for (int i = 0; i < listProductInCart.size(); i++) {
		 * logger.info("Test item: " + listProductInCart.get(i));
		 * assertTrue(action.verifyText(listProductInCart.get(i),
		 * listNameProductAdded.get(listProductInCart.size() - i - 1))); }
		 */
	}
}
