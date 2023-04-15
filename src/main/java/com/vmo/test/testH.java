package com.vmo.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vmo.listener.TestNGListener;

public class testH extends TestNGListener {
    public String DEV = "//td[@class=\"ng-binding\"][1]";

    @Parameters("browser")
    @Test
    public void test(){
        action.navigateToUrl("https://www.mailinator.com/v4/public/inboxes.jsp?to=hang887");
        action.getText(DEV);
    }
}
