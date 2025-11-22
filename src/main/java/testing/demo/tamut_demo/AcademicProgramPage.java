package testing.demo.tamut_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcademicProgramPage {

    WebDriver driver;

    public AcademicProgramPage(WebDriver driver) {
        this.driver = driver;
    }

    // Section links under "Academics"
    public By undergraduatePrograms = By.linkText("Undergraduate Programs");
    public By graduatePrograms = By.linkText("Graduate Programs");
    public By doctorateProgram = By.linkText("Doctorate Program");
    public By onlinePrograms = By.linkText("Online Programs");

    // Computer Science "Learn More" link
    public By csLearnMore = By.partialLinkText("Computer Science");

    /** 
     * Verify the Academics page is loaded by checking the presence 
     * of the Undergraduate Programs link 
     */
    public boolean isLoaded() {
        return driver.findElement(undergraduatePrograms).isDisplayed();
    }

    /** Click Computer Science “Learn More” */
    public void clickComputerScienceLearnMore() {
        driver.findElement(csLearnMore).click();
    }
}