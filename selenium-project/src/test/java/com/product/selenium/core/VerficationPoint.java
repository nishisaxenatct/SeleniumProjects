package com.product.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerficationPoint {
	public static void main(String srg[]) throws InterruptedException{
		// TODO Auto-generated method stub
				System.out.println("Launch the Chrome");
				System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkSpace2018\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			    Thread.sleep(5000);
			    
			    driver.get("https://www.google.com/");
			    Thread.sleep(5000);
			    String Title=driver.getTitle();
			    if (Title.contains("Google")){
			    	System.out.println("Lauched Google Page Test_Passes");
			    }else{
			    	System.out.println("Launched Google Page Test_Failed");
			    }
			    
			    //
			    boolean linkExistance = driver.findElement(By.linkText("Gmail")).isDisplayed();
			    if (linkExistance==true){
			    	System.out.println("Gmail Link Existes, Launched Google Page Test Pass");
			    }else{
			    	System.out.println("Gmail Link not Existes, Launched Google Page test Fail");
			    }
			    driver.close();
	}

}
