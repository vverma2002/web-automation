package dev.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		SeleniumUtils utils = new SeleniumUtils(driver);
		WebElement searchBox = utils.findElementByTagName("q");
		utils.setText(searchBox, "Selenium");
		searchBox.submit();

		WebElement results = utils.findElementById("result-stats");
		String resultText = utils.getText(results);
		System.out.println(resultText);

		driver.quit();
	}
}
