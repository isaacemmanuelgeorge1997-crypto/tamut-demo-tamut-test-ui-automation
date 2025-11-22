package testing.demo.tamut_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAcademicProgramsPage {

    private WebDriver driver;
    private AcademicProgramPage programsPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        programsPage = new AcademicProgramPage(driver);
    }

    @Test
    public void testAcademicProgramsLandingPage() {
        driver.get("https://www.tamut.edu/academic-programs/index.html");
        Assert.assertTrue(programsPage.isLoaded(), "Academic Programs landing page did not load.");
    }

    @Test
    public void testUndergraduateProgramsPage() {
        driver.get("https://www.tamut.edu/academic-programs/undergraduate.html");
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/undergraduate.html"),
                "Undergraduate Programs page URL incorrect.");
    }

    @Test
    public void testGraduateProgramsPage() {
        driver.get("https://www.tamut.edu/academic-programs/graduate.html");
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/graduate.html"),
                "Graduate Programs page URL incorrect.");
    }

    @Test
    public void testDoctorateProgramsPage() {
        driver.get("https://www.tamut.edu/academic-programs/doctorate.html");
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/doctorate.html"),
                "Doctorate Programs page URL incorrect.");
    }

    @Test
    public void testOnlineProgramsPage() {
        driver.get("https://www.tamut.edu/academic-programs/online.html");
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/online.html"),
                "Online Programs page URL incorrect.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
