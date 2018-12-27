package com.product.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Launch the Chrome");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    //get method to use open the url
	    driver.get("http://cms.nic.in/ncdrcusersWeb/login.do?method=caseStatus");
	    WebElement Option1=driver.findElement(By.xpath("html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"));
	    if(Option1.isSelected()){
	    	System.out.println("B is On");
	    }
	    Thread.sleep(5000);
	    
	    WebElement Option2=driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"));
	    if(Option2.isSelected()){
	    	System.out.println("B is off");
	    	  Thread.sleep(5000);
	    }
	    	else{
	    		System.out.println("");
	    	}
	    }
	   
	    
	    

	}



