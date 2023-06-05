package dev.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessSelenium {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Configure Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        // Initialize the ChromeDriver with the headless options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website and perform actions
        driver.get("https://www.example.com");
        System.out.println("Page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
