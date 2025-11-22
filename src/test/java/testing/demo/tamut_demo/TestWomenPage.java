package testing.demo.tamut_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWomenPage {

    private WebDriver driver;
    private WomenPage womenPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tamut.edu");

        womenPage = new WomenPage(driver);
    }

    @Test
    public void testWomenPageLoadsCorrectly() {
        // Navigate using navbar
        womenPage.clickWomenMenu();

        // Validate Women Page loaded
        Assert.assertTrue(
            womenPage.isWomenPageDisplayed(),
            "Women for A&M-Texarkana page header not visible!"
        );

        // Validate important links
        Assert.assertTrue(
            womenPage.scholarshipDonationVisible(),
            "Scholarship Donation link not visible!"
        );

        Assert.assertTrue(
            womenPage.joinWomenVisible(),
            "Join Women for A&M-Texarkana link not visible!"
        );
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
