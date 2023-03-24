package dev.selenium.util;

import org.openqa.selenium.By;

public class TestSeleniumUtil {

    public static void main(String[] args) {
        SeleniumUtil util = new SeleniumUtil();
        util.openUrl("https://www.example.com");

        By searchBox = By.name("q");
        util.waitForElementToBeVisible(searchBox);
        util.typeText(searchBox, "Selenium");

        By searchButton = By.name("btnK");
        util.waitForElementToBeClickable(searchButton);
        util.click(searchButton);

        // Add other test steps

        util.closeBrowser();
    }
}
