package testing.demo.tamut_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlumniFriendPage {

    private WebDriver driver;
    private final String URL = "https://tamut.edu/alumni/index.html";

    // Robust locators that never break
    @FindBy(xpath = "//a[contains(@href, 'brick')]")
    private WebElement brickLink;

    @FindBy(xpath = "//a[contains(@href, 'alumni-membership')]")
    private WebElement membershipLink;

    @FindBy(xpath = "//a[contains(@href, 'update-info')]")
    private WebElement updateInfoLink;

    public AlumniFriendPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(URL);
    }

    public boolean isLoaded() {
        return brickLink.isDisplayed()
            && membershipLink.isDisplayed()
            && updateInfoLink.isDisplayed();
    }

    public void clickBrick() {
        brickLink.click();
    }

    public void clickMembership() {
        membershipLink.click();
    }

    public void clickUpdateInfo() {
        updateInfoLink.click();
    }
}
