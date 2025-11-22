package testing.demo.tamut_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WomenPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // === Constructor ===
    public WomenPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // === Locators ===

    // Real header from the website: "Women for A&M-Texarkana"
    private By pageHeader = By.xpath("//h1[normalize-space()='Women for A&M-Texarkana']");

    // Exact link text on the page
    private By scholarshipDonation = By.xpath("//a[normalize-space()='Make a Scholarship Donation']");

    private By joinWomen = By.xpath("//a[normalize-space()='Join Women for A&M-Texarkana']");

    // Top navigation → "Alumni" → "Women for A&M-Texarkana"
    private By alumniMenu = By.xpath("//a[contains(text(),'Alumni')]");
    private By womenMenuLink = By.xpath("//a[contains(text(),'Women for A&M-Texarkana')]");

    // === ACTIONS ===

    // Clicks through the navbar: Alumni → Women for A&M-Texarkana
    public void clickWomenMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(alumniMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(womenMenuLink)).click();
    }

    // Check if header is displayed
    public boolean isWomenPageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageHeader)).isDisplayed();
    }

    // === ELEMENT VISIBILITY HELPERS ===

    public boolean scholarshipDonationVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(scholarshipDonation)).isDisplayed();
    }

    public boolean joinWomenVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(joinWomen)).isDisplayed();
    }

    // Optional getters, if you need the elements:
    public WebElement getScholarshipDonationButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(scholarshipDonation));
    }

    public WebElement getJoinWomenButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(joinWomen));
    }
}
