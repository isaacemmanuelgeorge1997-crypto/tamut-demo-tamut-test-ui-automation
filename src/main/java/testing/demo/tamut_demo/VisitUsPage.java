package testing.demo.tamut_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
   
public class VisitUsPage {

	WebDriver driver;
	
	@FindBy(linkText = "Upcoming Events")
	private WebElement upcomingEventsLink;

	public By campusTourCard;

	public By virtualTourCard;

	public By scheduleVisitCard;
	
	public VisitUsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public WebElement getUpcomingEventsLink() {
		return upcomingEventsLink;
	}

	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
}
	
	
