package dev.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MvnSearchAutomation {
	public static void main(String[] args) throws InterruptedException {
		// Open the browser and navigate to JIRA login page
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mvnrepository.com/");

		// Enter JIRA login credentials
		WebElement searchInput = driver.findElement(By.id("query"));
		
		WebElement searchButton = driver.findElement(By.className("button"));

		
		searchInput.sendKeys("selenium");
		Thread.sleep(5000); // Wait for the page to load
		searchButton.click();
		Thread.sleep(5000); // Wait for the page to load

		// Wait for the page to load and navigate to the "Create Issue" page
		Thread.sleep(5000); // Wait for the page to load
	

		// Close the browser
		driver.quit();
	}
}
