package com.product.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumTest01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// set the property
		//System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver.exe");
		
		//Set the property for mozilla
		System.setProperty("webdriver.gecko.driver", "F:\\EclipseWorkSpace2018\\Selenium\\geckodriver.exe");
		
		//Set the property for ie
		
		//System.setProperty("webdriver.ie.driver", "F:\\EclipseWorkSpace2018\\Selenium\\IEDriverServer.exe");
		
		//open a new chrome browser
		//WebDriver driver = new ChromeDriver();
		
		//open a new mozilla browser
		WebDriver driver = new FirefoxDriver();
		
		//Open the IE browser
		
		//WebDriver driver = new InternetExplorerDriver();
		
		//wait time
		Thread.sleep(5000);
		
		//close the browser
		driver.close();

	}

}
