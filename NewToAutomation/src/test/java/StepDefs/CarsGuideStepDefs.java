package StepDefs;

import org.testng.Assert;

import Pages_ObjectsAndActions.CarsGuide_ObjectsAndActions;
import Utils.LaunchWebDriver;
import io.cucumber.java.en.*;

public class CarsGuideStepDefs {
	
	LaunchWebDriver launchWebDriver;
	CarsGuide_ObjectsAndActions carsGuide_ObjectsAndActions;

	@Given("User is on CarsGuide Site")
	public void user_is_on_cars_guide_site() {
		// Write code here that turns the phrase above into concrete actions
		LaunchWebDriver.LaunchUrl("https://www.carsguide.com.au/");
	}

	@Then("Navigate to buy_sell dropdown link")
	public void navigate_to_buy_sell_dropdown_link() {
		// Write code here that turns the phrase above into concrete actions
		CarsGuide_ObjectsAndActions.moveToBuy_SellDropdown();
	}

	@And("clicks on Search Cars Link")
	public void clicks_on_search_cars_link() {
		// Write code here that turns the phrase above into concrete actions
		CarsGuide_ObjectsAndActions.clickOnSearchCarLink();
	}

	@Then("the User is expected to land on new and used cars search page")
	public void the_user_is_expected_to_land_on_new_and_used_cars_search_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(LaunchWebDriver.getdriver().getCurrentUrl(), "https://www.carsguide.com.au/buy-a-car/new-and-used-car-search");
	}
}
