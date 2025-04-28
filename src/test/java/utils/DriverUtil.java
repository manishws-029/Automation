package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

    protected static WebDriver driver;

    // Initialize the WebDriver
    public void initializeDriver(String browser) {
        if (driver != null) {
            throw new IllegalStateException("Driver is already initialized. Call 'closeWindow()' before reinitializing.");
        }

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser +
                        ". Supported browsers are: chrome, firefox, edge.");
        }

        // Open the URL
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
    }

    // Close the WebDriver
    public void closeWindow() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.err.println("Error while closing the browser: " + e.getMessage());
            } finally {
                driver = null;
            }
        } else {
            System.out.println("Driver is not initialized or already closed.");
        }
    }
}
