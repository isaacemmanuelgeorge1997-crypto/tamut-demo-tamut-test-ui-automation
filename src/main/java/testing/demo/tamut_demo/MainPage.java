package testing.demo.tamut_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;
    private final String URL = "https://tamut.edu";

    @FindBy(id = "searchBox") WebElement searchBox;

    @FindBy(xpath = "//a[@title = 'About TAMUT']") WebElement aboutMenu;

    @FindBy(linkText = "Visit Us")
    private WebElement visitUsItem;
	public By academicsMenu;
	public By alumniMenu;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(URL);
    }

    public void sendKeys2SearchBox(String searchInput) {
        searchBox.sendKeys(searchInput + Keys.ENTER);
    }

    public void hoverOverAbout() {
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutMenu).perform();
    }

    public void clickVisitUs() {
        visitUsItem.click();
    }


	public void searchText(String string) {
		// TODO Auto-generated method stub
		
	}

	public void searchText1(String string) {
		// TODO Auto-generated method stub
		
	}

	public void clickAlumniLink() {
		// TODO Auto-generated method stub
		
	}
}
