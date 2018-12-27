package com.product.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    
	    driver.get("http://www.way2sms.com/");
	    Thread.sleep(5000);

	}

}
