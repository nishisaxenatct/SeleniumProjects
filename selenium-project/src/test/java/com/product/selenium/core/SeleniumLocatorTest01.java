package com.product.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorTest01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(3000);
		//open URL
		driver.get("https://google.com/");
		String baseURl=driver.getCurrentUrl();
		System.out.println(baseURl);
		Thread.sleep(5000);
		//navigate().to("URL)
		/*Alternative for get method to move step forward */
	
		driver.navigate().to("https://www.seleniumhq.org/");
		String secondURL = driver.getCurrentUrl();
		System.out.println(secondURL);
		Thread.sleep(5000);
		//Navigate to baseURL
		driver.navigate().back();
		Thread.sleep(5000);
		String thirdURL = driver.getCurrentUrl();
		System.out.println(thirdURL);
		Thread.sleep(5000);
		//Navigate to forward
		driver.navigate().forward();
		String fourthURL = driver.getCurrentUrl();
		System.out.println(fourthURL);
		Thread.sleep(5000);
		//Navigate referesh
		driver.navigate().refresh();
		String fivthURL = driver.getCurrentUrl();
		System.out.println(fivthURL);
		Thread.sleep(5000);
		
		//Systax
		/*object.manage().window().maximize()*/
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//close the browser
		driver.close();
		

	}

}
