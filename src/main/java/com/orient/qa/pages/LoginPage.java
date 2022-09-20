package com.orient.qa.pages;



import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orient.qa.base.TestBase;

import Wait.WebDriverWait;

public class LoginPage extends TestBase {
	

	@FindBy(xpath="//input[@class='upload_txt']")
	WebElement submit;

	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public String testMethod1()
	{
		String title=driver.getTitle();
		return title;
	}
	
	
}





























	
	/*
	 * @FindBy(xpath="//a[@id='dropdown3']") WebElement men;
	 * 
	 * 
	 * @FindBy(
	 * xpath="//div[@class='link-column__header' and text()='Men']/following-sibling::div//a"
	 * ) List<WebElement> listundermen;
	 * 
	 * 
	 * 
	 * public void clickmen() { men.click(); }
	 * 
	 * 
	 * public List<WebElement> listundermen() {
	 * 
	 * return listundermen; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public LoginPage() { PageFactory.initElements(driver, this); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	

	
/*	@FindBy(xpath = "//input[@id='email']")
	WebElement Username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//button[@class='primary-btn']")
	WebElement LoginButton;

	@FindBy(xpath = "//div[contains(text(),'Please enter your email')]")
	WebElement BlankEmailPlaceholder;

	@FindBy(xpath = "//div[contains(text(),'Please enter your password')]")
	WebElement BlankPasswordPlaceholder;

	@FindBy(xpath = "//div[@role='alert']")
	public WebElement InvalidEmail;

	@FindBy(xpath = "//div[contains(text(),'Password entered is invalid.')]")
	public WebElement InvalidPassword;

	@FindBy(xpath = "//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']//div")
	WebElement EmailDoesNotExists;

//Initilizing the variable in the driver with the help of page factory

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean ValidateUserName() {

		boolean username = Username.isEnabled();
		return username;
	}

	public boolean ValidatePassword() {
		boolean password = Password.isEnabled();
		return password;
	}

	public void EnterValidUsername() {
		Username.sendKeys(prop.getProperty("ValidUsername"));
	}

	public void EnterValidPassword() {
		Password.sendKeys(prop.getProperty("ValidPassword"));
	}

	public void EnterInvalidUserName() {
		Username.sendKeys(prop.getProperty("InvalidUserName"));
	}

	public void EnterInvalidPassword() {
		Password.sendKeys(prop.getProperty("InvalidPassword"));
	}

	public void ClickOnLoginButton() {
		LoginButton.click();
	}

	public String HomePage() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public String InvalidEmail() {
		String invalidemail = InvalidEmail.getText();
		System.out.println(invalidemail);
		return invalidemail;
	}

	public String EmailDoesNotExists() {
		String emaildoesnotexists = EmailDoesNotExists.getText();
		return emaildoesnotexists;
	}

	public String passwordEnteredIsInvalid() {

		String passwordEnteredIsInvalid = InvalidPassword.getText();
		System.out.println(passwordEnteredIsInvalid);
		System.out.println();
		return passwordEnteredIsInvalid;
	}

	public Homepage EnterValidUserNameAndPassword() {
		Username.click();
		Username.sendKeys(prop.getProperty("ValidUsername"));
		Password.click();
		Password.sendKeys(prop.getProperty("ValidPassword"));
		LoginButton.click();
		return new Homepage();

	}

}
*/