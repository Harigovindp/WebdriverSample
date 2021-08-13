package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;
import net.bytebuddy.asm.Advice.This;

public class HomePage extends Testbase {
	
	//Webelements
	
	@FindBy(name= "search")
	WebElement searchbox;
	
	@FindBy(className = "input-group-btn")
	WebElement searchbtn;
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this );
	}

	
	
	//Actions
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void serach(String s)
	{
		searchbox.sendKeys(s);
		searchbtn.click();
	}

}
