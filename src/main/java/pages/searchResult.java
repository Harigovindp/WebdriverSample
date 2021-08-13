package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class searchResult extends Testbase {
	@FindBy(xpath="//h1[contains(text(), 'Search - Phone')]")
	WebElement searchheader;
	
	 public searchResult()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public boolean validateheader()
	{
		return searchheader.isDisplayed();
	}
	

}
