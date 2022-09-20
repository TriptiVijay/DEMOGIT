package com.orient.qa.base;


	

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FileExtension;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.orient.qa.utill.Utill;

	import bsh.Console;

	public class TestBase {

		public static WebDriver driver;
		public static Properties prop;
		public static ChromeOptions options;
		
		
		public TestBase()
		{
			try {
				prop = new Properties();
				
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orient\\qa\\config\\config.properties");
				System.out.println(ip);
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	public static void initilization()
	{
		String browserName=prop.getProperty("browser");
		
		
		
		if(browserName.equals("chrome"))
		{	
			
			System.setProperty("webdriver.chrome.driver","C:\\driverexe\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-blink-features=AutomationControlled");
			ChromeDriver driver = new ChromeDriver(options);
			
		driver= new ChromeDriver();
		}
		else if(browserName.equals("FF"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32 (15).zip" );
			driver= new FirefoxDriver();
		}
	
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Utill.page_time,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utill.implicitwait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	}


	
	
	  

