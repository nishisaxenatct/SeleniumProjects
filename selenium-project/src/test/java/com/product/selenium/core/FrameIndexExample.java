package com.product.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIndexExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    
	    driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
	    Thread.sleep(5000);
	    //switching to 0th frameIndex
	    driver.switchTo().frame(0);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[text()='com.thoughtworks.selenium']")).click();
	    Thread.sleep(5000);
	    //Switch to top Windows
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	    //Switch to 0th to 1st frame(switch 0  to 1 frame)
	    driver.switchTo().frame(1);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
	    Thread.sleep(5000);
	    driver.close();
	    

	}

}
