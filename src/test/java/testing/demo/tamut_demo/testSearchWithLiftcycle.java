package testing.demo.tamut_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class testSearchWithLiftcycle {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tamut.edu");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testSearchFeatureLifecycle() {

        MainPage main = new MainPage(driver);

        // 🔥 Use the REAL working method from your MainPage
        main.sendKeys2SearchBox("Computer Science");

        // Wait for result
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.partialLinkText("Computer Science")
        ));

        // Validate result found
        Assert.assertTrue(
                driver.findElement(By.partialLinkText("Computer Science")).isDisplayed(),
                "Expected search result was not found."
        );
    }
}
