package com.product.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    
	    driver.get("https://www.seleniumhq.org/download/");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@id='mainContent']/table[1]/tbody[1]/tr[1]/td[4]/a")).click();
	    Thread.sleep(8000);
	    driver.close();

	}

}
