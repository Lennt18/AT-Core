package pages;

import java.text.MessageFormat;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

import com.vmo.utils.log.LogHelper;

import webkeywords.WebKeywords;

public class FilterMenu {
	private static Logger logger = LogHelper.getLogger();
	private WebKeywords action;

	private String DIV_COLOR = "//div[@title='Color']";
	private String DIV_SIZE_FILTER = "//div[@class='CardCollaspe__TitleAndBadge-sc-1jxh92o-6 kwYXNQ'][normalize-space()='Screen Size Group (inches)']";
	private String DIV_GROUP_SIZE = "//div[@title='Screen Size Group (inches)']//div[@class='CardCollaspe__CardBody-sc-1jxh92o-3 fngqqm']//div[@class='Row__Wrapper-v6uxgu-0 kSLyDU']";
	private String DIV_BTN_SELECT_OPTION = "//div[@title='Screen Size Group (inches)']//div[@class='CardCollaspe__CardBody-sc-1jxh92o-3 fngqqm']//div[@class='Row__Wrapper-v6uxgu-0 kSLyDU']//div[@class='Checkbox-dODbyV kbXHRt']";

	public FilterMenu(WebKeywords action) {
		this.action = action;
	}

	public void FilterSearch(String size) {
		action.scrollToElement(DIV_COLOR);
		clickSelectOption(size);
	}

	// select filter screen
	public void clickSelectOption(String size) {
		logger.info("Clicking select option filter of " + size);
		try {
			List<WebElement> groupOption = action.findWebElements(DIV_GROUP_SIZE);
			List<WebElement> groupSelectOption = action.findWebElements(DIV_BTN_SELECT_OPTION);
			for (int i = 0; i < groupOption.size(); i++) {
				String actualGroupOption = (action.getText(groupOption.get(i)).split("\\("))[0].replaceAll(" ", "");
				if (actualGroupOption.equals(size)) {
					action.click(groupSelectOption.get(i));
					break;
				}
			}
			logger.info(MessageFormat.format("Clicked button select option of ''{0}'' by ''{1}'' successfully", size, DIV_BTN_SELECT_OPTION));
		} catch (Exception e) {
			logger.error(MessageFormat.format("Cannot click button select option of ''{0}''. Root cause is: ''{1}''",
					size, e.getMessage()));
		}
	}
}
