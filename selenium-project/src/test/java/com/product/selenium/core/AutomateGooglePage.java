package com.product.selenium.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateGooglePage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\code\\selenium-project\\src\\test\\java\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    
	    driver.get("https://gmail.com/");
	    Thread.sleep(5000);
	    driver.findElement(By.id("identifierId")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.id("identifierId")).sendKeys("nishisaxenatct");
	    Thread.sleep(2000);
	    driver.findElement(By.id("identifierId")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("saxenanishi123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	    Thread.sleep(15000);
	    driver.findElement(By.name("to")).sendKeys("kumaanu5@gmail.com");
	    Thread.sleep(5000);
	    driver.findElement(By.name("subjectbox")).sendKeys("TestAutomationSelenium");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi Anuj", Keys.ENTER,"This is my First Automation");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@data-tooltip='Attach files']")).click();
	    Thread.sleep(5000);
	    //Put the data in Clip Board
	    StringSelection s = new StringSelection("C:\\Users\\Anuj\\Pictures\\priyanka-chopra-202a.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	    //attachment window using JAVA ROBOT
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//div[text()='Send']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[starts-with(aria-label='Google')]/child::*")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	    Thread.sleep(10000);
	    driver.close();

	}

}
