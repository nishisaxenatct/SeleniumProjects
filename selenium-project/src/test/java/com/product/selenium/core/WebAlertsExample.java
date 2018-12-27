package com.product.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\code\\selenium-project\\src\\test\\java\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    Thread.sleep(5000);
	    

	}

}
