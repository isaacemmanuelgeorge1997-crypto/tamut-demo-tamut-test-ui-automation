package testing.demo.tamut_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputerSciencePage {

    WebDriver driver;

    public ComputerSciencePage(WebDriver driver) {
        this.driver = driver;
    }

    public By homeLink = By.xpath("//a[contains(normalize-space(), 'Computer Science') and contains(@href,'/computer-science/index.html')]");
    public By accreditationLink = By.linkText("Accreditation Information");
    public By facultyLink = By.linkText("Faculty");

    public boolean isHomeLoaded() {
        return driver.getCurrentUrl().contains("/computer-science/index.html");
    }

    public boolean isAccreditationPageLoaded() {
        return driver.getCurrentUrl().contains("/computer-science/accreditation.html");
    }

    public boolean isFacultyPageLoaded() {
        return driver.getCurrentUrl().contains("/computer-science/faculty.html");
    }

    public void clickAccreditation() {
        driver.findElement(accreditationLink).click();
    }

    public void clickFaculty() {
        driver.findElement(facultyLink).click();
    }
}
