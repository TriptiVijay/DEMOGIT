
  package com.orient.qa.testcases;
  
  import java.text.ParseException; import java.text.SimpleDateFormat; import
  java.time.LocalDate; import java.util.Date; import java.util.List; import
  java.util.Locale;
  
  import org.openqa.selenium.Dimension; import org.openqa.selenium.WebElement;
  import org.testng.Assert; import org.testng.annotations.AfterMethod; import
  org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;
  
  import com.orient.qa.base.TestBase; import com.orient.qa.pages.Homepage;
  import com.orient.qa.pages.LoginPage;
  
public class HomePageTest extends TestBase {
	
	

	
	public HomePageTest() {
		super();
	}

	@BeforeMethod

	public void SetUp() {
		initilization(); // loginpage = new LoginPage(); //
		//homepage = loginpage.EnterValidUserNameAndPassword();
	}
  
  
	@Test(priority = 1)
	public void VerifyHomePageTitle() {
		System.out.println("print10");
		  
	}

	@Test(priority = 23)
	public void Verifyuserabletoclickonviewbutton() {
		System.out.println("print0");
		  
	}

	@Test(priority = 1)
	public void Searchfunshouldworkfinewithnodata() {
		System.out.println("print1");
		  

	}

	@Test(priority = 2)
	public void Searchfunshouldworkfinewithproperdata() {
		System.out.println("print2");
		  

	}

  @Test public void ValidateTextIfNoDataWithinGenteredDate( ) {
  
  System.out.println("print3");
  
  
  }
  
  
  
  }