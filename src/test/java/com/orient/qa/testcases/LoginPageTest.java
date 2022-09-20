
package com.orient.qa.testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orient.qa.base.Listener;
import com.orient.qa.base.TestBase;
import com.orient.qa.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginPageTest extends TestBase

{
	LoginPage loginpage;
	//Listener listen =new Listener();

	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {

		initilization();
		//loginpage = new LoginPage(); // Listener listen= new
		//Listener();

	}

	@Test(priority = 1)
	public void Searchfunshouldworkfinewithnodata1() {
		//System.out.println("loginprint1");
		  
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println(iframeElements.size());

	}

	@Test(priority = 2)
	public void Searchfunshouldworkfinewithproperdata() {
		System.out.println("loginprint2");
		  

	}

	

	
}
