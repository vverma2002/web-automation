package dev.selenium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {

	private WebDriver driver;

	public SeleniumUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement findElementById(String id) {
		return driver.findElement(By.id(id));
	}

	public WebElement findElementByClassName(String className) {
		return driver.findElement(By.className(className));
	}

	public WebElement findElementByTagName(String tag) {
		return driver.findElement(By.tagName(tag));
	}

	public WebElement findElementByCssSelector(String cssSelector) {
		return driver.findElement(By.cssSelector(cssSelector));
	}

	public WebElement findElementByXPath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public void click(WebElement element) {
		element.click();
	}

	public void setText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

}
