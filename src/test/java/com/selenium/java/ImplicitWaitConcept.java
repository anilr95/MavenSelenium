package com.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) 
	{
       WebDriverManager.chromedriver().setup();      
		
		WebDriver driver=new ChromeDriver();        //It will launch chrome
		
		driver.get("https://www.ebay.com/");    //enter url    
		
		/*-----Dynamic Wait---
		 * it will wait to load the elements if the element is found in 2 sec then it
		 * will not wait for rest of the time
		 */
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
