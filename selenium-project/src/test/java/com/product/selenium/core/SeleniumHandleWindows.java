package com.product.selenium.core;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(3000);
	  //open URL
	  		driver.get("https://seleniummaster.com/llc/");
	  		String baseURl=driver.getCurrentUrl();
	  		System.out.println(baseURl);
	  		Thread.sleep(5000);
	  		driver.findElement(By.xpath("//*[@id='siteseal']/child::*[2]")).click();
	  		Thread.sleep(5000);
	  		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
	  		driver.switchTo().window(wins.get(1));//
	  		Thread.sleep(5000);
	  		driver.switchTo().window(wins.get(0));
	  		Thread.sleep(5000);
	  		driver.switchTo().window(wins.get(1));
	  		Thread.sleep(5000);
	  		driver.switchTo().window(wins.get(0));
	  		Thread.sleep(5000);
	  		
	  		driver.close();

	}

}
