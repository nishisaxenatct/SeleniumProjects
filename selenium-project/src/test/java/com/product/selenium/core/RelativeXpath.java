package com.product.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubSystem.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);

	   //get method to use open the url
	    driver.get("https://login.yahoo.com/");
	    driver.findElement(By.xpath("//input[@id='login-username']")).click();
	    Thread.sleep(5000);
	    
	    driver.close();
		

	}

}
