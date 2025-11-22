package testing.demo.tamut_demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
* Basic smoke test to verify the TAMUT Main Page loads
* and main navigation items are present.
*/
public class TestMainPage  {


@Test
public void testMainPageLoads() {


WebDriver driver = null;
MainPage main = new MainPage(driver);


// Validate page title contains TAMUT
Assert.assertTrue(driver.getTitle().contains("A&M"), "Main page title is incorrect.");


// Validate top menu items exist
Assert.assertTrue(driver.findElement((By) main.aboutMenu).isDisplayed());
Assert.assertTrue(driver.findElement(main.academicsMenu).isDisplayed());
Assert.assertTrue(driver.findElement(main.alumniMenu).isDisplayed());
Assert.assertTrue(driver.findElement((By) main.searchBox).isDisplayed());
}
}