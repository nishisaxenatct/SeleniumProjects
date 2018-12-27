package com.product.selenium.core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);

	   //get method to use open the url
	    driver.get("http://newtours.demoaut.com/");
	    List<WebElement> e=driver.findElements(By.tagName("a"));
	    System.out.println(e.size());
	    for (int i =0;i<e.size();i=i+1){
	    	System.out.println(e.get(i).getText());
	    }
	    
	    driver.close();
	    
	}

}
