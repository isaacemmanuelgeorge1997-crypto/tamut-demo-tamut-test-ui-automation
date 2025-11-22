package testing.demo.tamut_demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestVisitUsPage {

	private WebDriver driver;
	private MainPage mainPage;

	@BeforeClass
	public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mainPage = new MainPage(driver);
		mainPage.open();
	}
	
	@Test
	public void testVisitUs() {
		mainPage.hoverOverAbout();
		mainPage.clickVisitUs();
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		
		assertTrue(visitUsPage.getUpcomingEventsLink().isDisplayed());
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@AfterClass
	public void tearDownClass() {
		System.out.println("All Visit Us tests completed.");
	}

}
