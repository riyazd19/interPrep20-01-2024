package javaRealatedQuestions;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Take a screenshot
        takeScreenshot(driver, "screenshot.png");

        // Close the browser
        driver.quit();
    }

    // Method to take a screenshot
    public static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            // Convert the WebDriver instance to TakesScreenshot
            TakesScreenshot ts = (TakesScreenshot) driver;

            // Get the screenshot as a file
            File sourceFile = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);

            // Specify the destination file path
            File destinationFile = new File(fileName);

            // Copy the file to the destination
            FileUtils.copyFile(sourceFile, destinationFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
