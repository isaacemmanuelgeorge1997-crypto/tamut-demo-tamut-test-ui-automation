package testing.demo.tamut_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestVisitUsPage {

    private WebDriver driver;
    private VisitUsPage visitUsPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        visitUsPage = new VisitUsPage(driver);
    }

    @Test
    public void testVisitUsLandingPage() {
        driver.get("https://www.tamut.edu/visit/index.html");
        Assert.assertTrue(visitUsPage.isLoaded(), "Visit Us landing page did not load.");
    }

    @Test
    public void testUpcomingEventsPage() {
        driver.get("https://visit.tamut.edu/");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://visit.tamut.edu/"),
                "Upcoming Events page URL incorrect.");
    }

    @Test
    public void testCampusTourPage() {
        driver.get("https://visit.tamut.edu/event/306201?p=dGFtdXQuZXZlbnRzLjMwNjIwMQ%3D%3D");
        Assert.assertTrue(driver.getCurrentUrl().contains("306201"),
                "Campus Tour page URL incorrect.");
    }

    @Test
    public void testVirtualTourPage() {
        driver.get("https://www.tamut.edu/visit/virtual-tour.html");
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/virtual-tour.html"),
                "Virtual Tour page URL incorrect.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
