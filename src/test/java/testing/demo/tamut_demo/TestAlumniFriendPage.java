package testing.demo.tamut_demo;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestAlumniFriendPage {

    private WebDriver driver;
    private AlumniFriendPage alumniPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        alumniPage = new AlumniFriendPage(driver);
        alumniPage.open();
    }

    @Test
    public void testAlumniLinks() {
        assertTrue(alumniPage.isLoaded(), "Alumni page did not load!");

        alumniPage.clickBrick();
        driver.navigate().back();

        alumniPage.clickMembership();
        driver.navigate().back();

        alumniPage.clickUpdateInfo();
        driver.navigate().back();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
