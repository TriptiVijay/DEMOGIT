package com.orient.qa.pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.orient.qa.base.TestBase;

public class Homepage extends TestBase {

	@FindBy(xpath = "//div[@class='pri-btn-label']")
	WebElement viewbutton;

	@FindBy(xpath = "//input[@placeholder='Enter RR Number']")
	WebElement search;

	@FindBy(xpath = "//button[text()='Get Data']")
	WebElement getdata;

	@FindBy(xpath = "//div[@class='ant-empty-description' and text()='No Data']")
	WebElement nodataavailable;

	@FindBy(xpath = "//h3[@class='text-bold']")
	WebElement rrnumber;

	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement fromdatepicker;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement todatepicker;
	
	@FindBy(xpath="//div[@class='ant-picker-body']//table//td")
	List<WebElement> fromdatelist;
	
	
	
	@FindBy(xpath="//table[@class='ant-picker-content']")
	List<WebElement> todatelist;

	// @FindBys(xpath = "//div[@class='card-row']//span[text()='Placement
	// date:']/following-sibling::span", value = { @FindBy })
	/*
	 * @FindBys(value = { @FindBy(xpath =
	 * "//div[@class='card-row']//span[text()='Placement date:']/following-sibling::span"
	 * ) }) public List<WebElement> Placementdate;
	 */

	@FindBy(xpath = "//div[@class='card-row']//span[text()='Placement date:']/following-sibling::span")
	List<WebElement> Placementdate;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	  public String gettitle() { String title = driver.getTitle();
	  System.out.println(title); return title; }
	  
	  public boolean viewbutton() { boolean b = viewbutton.isEnabled(); return b; }
	  
	  public void ClickSearchButton() { search.click(); }
	  
	  public void Enterdatainsearchplaceholder() {
	  search.sendKeys(prop.getProperty("RRNUMBER1")); }
	  
	  public void Enterwrongdatainsearchplaceholder() {
	  search.sendKeys(prop.getProperty("RRNUMBER")); }
	  
	  public void getdata() { getdata.click(); }
	  
	  public String nodata() { String nodata = nodataavailable.getText(); return
	  nodata;
	  
	  }
	  
	  public boolean nodatatextisvisible() { boolean nodatadisplay =
	  nodataavailable.isDisplayed(); return nodatadisplay; }
	  
	  public boolean DisplayedRRNumber() { System.out.println(rrnumber); boolean b
	  = rrnumber.isDisplayed(); return b; }
	  
	  
	  public void selectdateinfromplaceholder() {
	  fromdatepicker.sendKeys(prop.getProperty("Fromdatepicker"));; }
	  
	  public void selectdateinfromplaceholder1() {
	  fromdatepicker.sendKeys(prop.getProperty("Fromdatepicker1")); }
	  
	  public void selectdateintoplaceholder() {
	  todatepicker.sendKeys(prop.getProperty("Todatepicker")); }
	  
	  
	  public void selectdateintoplaceholder1() {
	  todatepicker.sendKeys(prop.getProperty("Todatepicker1"));
	  
	  }
	  
	  
	  public int SelectPlacementDate() { return Placementdate.size();
	  
	  }
	 

	/*
	 * public List<WebElement> onevalue() { List<WebElement> web = Placementdate;
	 * return web; }
	 */
	
	
	public void FormDatePicker() {
		
		fromdatepicker.click();
		
		System.out.println("click");
		
		int size=fromdatelist.size();
		
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			String text = fromdatelist.get(i).getText();

			if (text == null) {
				System.out.println("do not print");
			}

			else if (text.equalsIgnoreCase("23")) {

				fromdatelist.get(i).click();
			} else {
				System.out.println("null");
			}
		}
	}

}
	
		

		
	


	/*
	 * public void ToDatePicker() {
	 * 
	 * todatepicker.click();
	 * 
	 * for(WebElement wb1: fromdatelist ) { String date= wb1.getText();
	 * 
	 * System.out.println(date);
	 * 
	 * if(date.equalsIgnoreCase(prop.getProperty("Todatepicker1"))); { wb1.click();
	 * break; } }
	 * 
	 * }
	 */

