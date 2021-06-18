package com.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProgram 
{
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\anu\\Desktop\\chromedriver\\chromedriver.exe");
		
	//1.Chrome browser: Automation 
	   WebDriverManager.chromedriver().setup();      //---it will automatically match chrome version and 
		//chrome driver version if there is mismatch it will download the appropriate version.
		
		WebDriver driver=new ChromeDriver();        //It will launch chrome
		
		driver.get("https://www.javatpoint.com/");    //enter url
		
		String title=driver.getTitle();                 //get or print current title
		System.out.println(title);       
        
		//Validation point
		if(title.equals("javatpoint"))
		{System.out.println("Correct Title");}
		else {System.out.println("Correct Title");}
		
		System.out.println(driver.getCurrentUrl());    //get or print current url
		System.out.println(driver.getPageSource());    //get the source code of the page
		driver.quit();                                 //quit browser
	}

}
