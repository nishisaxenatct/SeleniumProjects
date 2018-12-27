package com.product.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StartAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Set the Property to access the driver
		
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Open the browser
		
		WebDriver driver = new ChromeDriver();
		
		//Goto the URL
		
		driver.get("http://newtours.demoaut.com/");
		
		//Wait time
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Nishi");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("Saxena");
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("8197322890");
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("nishisaxenatct@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("326");
		Thread.sleep(3000);
		driver.findElement(By.name("address2")).sendKeys("22nd main");
		Thread.sleep(3000);
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("560076");
		Thread.sleep(3000);
		//driver.findElement(By.name("country"))
		Select s = new Select(driver.findElement(By.name("country")));
		//s.selectByIndex(92);
		s.selectByValue("92");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("nishisaxenatct");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("nishisaxenatct");
		Thread.sleep(3000);
		driver.findElement(By.name("confirmPassword")).sendKeys("nishisaxenatct");
		Thread.sleep(3000);
		driver.findElement(By.name("register")).submit();
		Thread.sleep(3000);
		driver.close();
	
		

	}

}
