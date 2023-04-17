package Pages_ObjectsAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import Utils.CommonActions;
import Utils.LaunchWebDriver;

public class CarsGuide_ObjectsAndActions {
	
	private static LaunchWebDriver launchWebDriver;
	private static CommonActions commonActions = new CommonActions();
	
	static Actions action = new Actions(LaunchWebDriver.getdriver());
	
	public static WebDriver driver;
	private static final By reviews = By.linkText("reviews");
	private static final By news = By.linkText("news");
	private static final By advice = By.linkText("advice");
	private static final By buy_sell = By.xpath("//*[@id='u_H']//a[@data-gtm-label='top nav car buy and sell']");
	private static final By searchCars = By.linkText("Search Cars");
	
	public CarsGuide_ObjectsAndActions(CommonActions commonActions)
	{
		CarsGuide_ObjectsAndActions.commonActions = commonActions;
		CarsGuide_ObjectsAndActions carsHomePageLocators = new CarsGuide_ObjectsAndActions(commonActions);
		PageFactory.initElements(LaunchWebDriver.getdriver(), carsHomePageLocators);
	}
	
	public static WebElement getBuySell_Dropdown() {
		return commonActions.getElement(buy_sell);
	}
	
	public static WebElement getReviews_Dropdown() {
		return commonActions.getElement(reviews);
	}
	
	public static WebElement getNews_Dropdown() {
		return commonActions.getElement(news);
	}
	
	public static WebElement getAdvice_Dropdown() {
		return commonActions.getElement(advice);
	}
	
	public static WebElement getSearchCar_Link() {
		return commonActions.getElement(searchCars);
	}
	
	
	public static void moveToBuy_SellDropdown() {
		action.moveToElement(getBuySell_Dropdown()).build().perform();
	}
	
	public static void clickOnSearchCarLink() {
		commonActions.clickOnElement(searchCars);
	}

}
