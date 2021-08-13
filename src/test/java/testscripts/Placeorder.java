package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Testbase;
import pages.HomePage;
import pages.searchResult;

public class Placeorder extends Testbase {
	HomePage homepage;
	searchResult rpage;
	public Placeorder()
	{
		super();
	}
	@BeforeTest
	public void setup()
	{
		initialize();
		homepage =new HomePage();
		rpage =new searchResult();
		
	}
  @Test(priority = 1)
  public void validatehomepage() {
	  
	  String  t= homepage.getPageTitle();
	  Assert.assertEquals(t,"Your Store");
  }
  @Test(priority = 2)
   public void f1()
  {
	  homepage.serach("phone");
	  String ti=homepage.getPageTitle();
	  Assert.assertEquals(ti, "Search - Phone");
	  
  }
  @Test(priority = 3)
  public void f3()
  {
	boolean ispres = rpage.validateheader();
	Assert.assertTrue(ispres);
  }
  @AfterTest
  public void f2()
  {
	  driver.close();
  }
}
