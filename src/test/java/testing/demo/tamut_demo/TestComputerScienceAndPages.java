package testing.demo.tamut_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestComputerScienceAndPages {

    WebDriver driver;
    ComputerSciencePage csPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        csPage = new ComputerSciencePage(driver);
    }

    @Test
    public void testCSHomePage() {
        driver.get("https://tamut.edu/academic-programs/computer-science/index.html");
        Assert.assertTrue(csPage.isHomeLoaded(), "CS home page did not load correctly.");
    }

    @Test
    public void testAccreditationPage() {
        driver.get("https://tamut.edu/academic-programs/computer-science/accreditation.html");
        Assert.assertTrue(csPage.isAccreditationPageLoaded(), "Accreditation page did not load.");
    }

    @Test
    public void testFacultyPage() {
        driver.get("https://tamut.edu/academic-programs/computer-science/faculty.html");
        Assert.assertTrue(csPage.isFacultyPageLoaded(), "Faculty page did not load.");
    }

    @Test
    public void testAdmissionsPage() {
        driver.get("https://tamut.edu/admissions/index.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("/admissions/index.html"),
                "Admissions page did not load.");
    }

    @Test
    public void testVisitUsPage() {
        driver.get("https://tamut.edu/visit/index.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("/visit/index.html"),
                "Visit Us page did not load.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
