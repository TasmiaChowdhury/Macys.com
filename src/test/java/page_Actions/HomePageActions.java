package page_Actions;

import org.openqa.selenium.support.PageFactory;

import page_Elements.HomePageElements;
import utilities.SetDriver;

public class HomePageActions {
	
	HomePageElements pageElements;
	
	public HomePageActions(){
		pageElements= new HomePageElements();  // Creating object of elemement page
		PageFactory.initElements(SetDriver.driver, pageElements);
	}
	
	public void getHomePage(){
		SetDriver.navigatetoHome();
	}
	
	public void searchItem(String item){
		pageElements.searchBox.clear();
		pageElements.searchBox.sendKeys("Shirts");
	}
	
	public void clickEnter(){
		pageElements.searchBox.click();
	}
	
	public void getTitle(){
		
	}

}
