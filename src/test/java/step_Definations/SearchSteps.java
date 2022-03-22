package step_Definations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import page_Actions.HomePageActions;

@RunWith(Cucumber.class)
public class SearchSteps {
	
	HomePageActions actions=new HomePageActions();  // creating object of action page

	@Given("user is on macys home page")
	public void user_is_on_macys_home_page() {
		actions.getHomePage();
		
		
	}

	@When("user enters items in search box{String}")
	public void user_enters_items_in_search_box(String anItem) {
		actions.searchItem(anItem);
	}

	@And("user press enter")
	public void user_press_enter() {
		actions.clickEnter();
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
	}

}
