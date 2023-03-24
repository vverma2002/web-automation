package dev.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JiraAutomation {
	public static void main(String[] args) throws InterruptedException {
		// Open the browser and navigate to JIRA login page
		WebDriver driver = new FirefoxDriver();
		driver.get("https://your-jira-url.com/login.jsp");

		// Enter JIRA login credentials
		WebElement usernameInput = driver.findElement(By.id("login-form-username"));
		WebElement passwordInput = driver.findElement(By.id("login-form-password"));
		WebElement loginButton = driver.findElement(By.id("login-form-submit"));

		usernameInput.sendKeys("your-username");
		passwordInput.sendKeys("your-password");
		loginButton.click();

		// Wait for the page to load and navigate to the "Create Issue" page
		Thread.sleep(5000); // Wait for the page to load
		driver.get("https://your-jira-url.com/secure/CreateIssue!default.jspa");

		// Fill in the necessary fields to create a new issue
		WebElement issueTypeInput = driver.findElement(By.id("issuetype-field"));
		WebElement summaryInput = driver.findElement(By.id("summary"));
		WebElement descriptionInput = driver.findElement(By.id("description"));
		WebElement createButton = driver.findElement(By.id("create-issue-submit"));

		issueTypeInput.sendKeys("Bug"); // Select the issue type
		summaryInput.sendKeys("Example Bug Report"); // Enter the issue summary
		descriptionInput.sendKeys("This is an example bug report created by Selenium."); // Enter the issue description
		createButton.click();

		// Wait for the issue to be created and get its issue key
		Thread.sleep(5000); // Wait for the issue to be created
		WebElement issueKey = driver.findElement(By.className("issue-created-key"));
		String issueKeyString = issueKey.getText(); // Get the issue key from the page

		// Print the created issue key to the console
		System.out.println("Created issue: " + issueKeyString);

		// Close the created issue
		driver.get("https://your-jira-url.com/browse/" + issueKeyString); // Navigate to the created issue
		WebElement moreActionsButton = driver.findElement(By.id("opsbar-operations_more"));
		moreActionsButton.click();
		WebElement closeIssueButton = driver.findElement(By.id("action_id_5"));
		closeIssueButton.click();
		WebElement closeIssueSubmitButton = driver.findElement(By.id("issue-workflow-transition-submit"));
		closeIssueSubmitButton.click();

		// Print the closed issue key to the console
		System.out.println("Closed issue: " + issueKeyString);

		// Close the browser
		driver.quit();
	}
}
