
package dev.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirstScriptTest {

	public static void main(String[] args) throws InterruptedException {
		new FirstScriptTest().eightComponents();
	}

	public void eightComponents() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//		System.setProperty("webdriver.firefox.driver","geckodriver.exe");
		
//		WebDriver driver = new ChromeDriver();
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(options);
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		String title = driver.getTitle();
//		assertEquals("Web form", title);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		WebElement textBox = driver.findElement(By.name("my-text"));
		WebElement submitButton = driver.findElement(By.cssSelector("button"));

		textBox.sendKeys("Selenium");
		submitButton.click();
		
		Thread.sleep(5000); // Wait for the page to load
		
		WebElement message = driver.findElement(By.id("message"));
		String value = message.getText();
//		assertEquals("Received!", value);

		System.out.println(value);
		
		driver.quit();
	}

}
