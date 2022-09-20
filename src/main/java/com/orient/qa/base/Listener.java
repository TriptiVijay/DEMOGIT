package com.orient.qa.base;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class Listener implements IReporter,  ITestListener{

	
	public void onTestStart(ITestResult result) {  
        // TODO Auto-generated method stub  
          System.out.println("message should be print when test stsart:"+result.getName());
    }  
  
   
    public void onTestSuccess(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Success of test cases and its details are : "+result.getName());  
    }  
  

    public void onTestFailure(WebDriver webdriver,ITestResult result) throws Throwable {  
        // TODO Auto-generated method stub  
        System.out.println("Failure of test cases and its details are : "+result.getName());
        
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		String fileWithPath = null;
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		 
        
        
        
        
        
        
        
    }  
  
   
    public void onTestSkipped(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Skip of test cases and its details are : "+result.getName());  
    }  
  
     
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Failure of test cases and its details are : "+result.getName());  
    }  
  
   
    public void onStart(ITestContext context) {  
        // TODO Auto-generated method stub  
          
    }  
  
    
    public void onFinish(ITestContext context) {  
        // TODO Auto-generated method stub  
          
    }  
    

    

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		
		
		
		
		ISuite suite = suites.get(0);
	    Map<String, Collection<ITestNGMethod>> methodsByGroup = suite.getMethodsByGroups();
	    Map<String, ISuiteResult> tests = suite.getResults();
	    for (String key : tests.keySet()) {
	    System.out.println("Key: " + key + ", Value: " + tests.get(key));
	    }
	    Collection<ISuiteResult> suiteResults = tests.values();
	    ISuiteResult suiteResult = suiteResults.iterator().next();
	    ITestContext testContext = suiteResult.getTestContext();
	    Collection<ITestNGMethod> perfMethods = methodsByGroup.get("smoke");
	    IResultMap failedTests = testContext.getFailedTests();
	    for (ITestNGMethod perfMethod : perfMethods) {
	    Set<ITestResult> testResultSet = failedTests.getResults(perfMethod);
	    for (ITestResult testResult : testResultSet) {
	    System.out.println("Test " + testResult.getName() + " failed, error " + testResult.getThrowable());
	    }
	    }
	    IResultMap passedTests = testContext.getPassedTests();
	    for (ITestNGMethod perfMethod : perfMethods) {
	    Set<ITestResult> testResultSet = passedTests.getResults(perfMethod);
	    for (ITestResult testResult : testResultSet) {
	    System.out.println("Test " + testResult.getName() + " passed, time took " +
	    (testResult.getEndMillis() - testResult.getStartMillis()));
		
		
	    }}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	    
	    

	
	
	
	
	
	public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Throwable {
		
		
				// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		

		
	}


	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
