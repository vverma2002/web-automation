package dev.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selectors {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		// Assume we have a WebDriver instance named "driver" that navigates to the page
		// with the table
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			if (cells.size() > 1 && cells.get(1).getText().startsWith("Version")) {
				// Found the row, do something
				System.out.println("Found row: " + row.getText());
				break;
			}
		}

//	    ID Selector: Selects an element by its ID attribute.
//	    Sample: driver.findElement(By.id("my-id"))
//
//	    Name Selector: Selects an element by its Name attribute.
//	    Sample: driver.findElement(By.name("my-name"))
//
//	    CSS Selector: Selects an element using a CSS selector.
//	    Sample: driver.findElement(By.cssSelector(".my-class"))
//
//	    XPath Selector: Selects an element using an XPath expression.
//	    Sample: driver.findElement(By.xpath("//div[@class='my-class']"))
//
//	    Class Name Selector: Selects an element by its class name attribute.
//	    Sample: driver.findElement(By.className("my-class"))
//
//	    Tag Name Selector: Selects an element by its tag name.
//	    Sample: driver.findElement(By.tagName("div"))
//
//	    Link Text Selector: Selects a link element by its visible text.
//	    Sample: driver.findElement(By.linkText("my-link"))
//
//	    Partial Link Text Selector: Selects a link element by its partial visible text.
//	    Sample: driver.findElement(By.partialLinkText("link"))
//
//	    JavaScript Selector: Executes a JavaScript code and returns the result.
//	    Sample: JavascriptExecutor executor = (JavascriptExecutor)driver; executor.executeScript("return document.getElementById('my-id');");
	}
}