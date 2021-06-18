package com.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovmentConcepts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();      //---it will automatically match chrome version and 
		//chrome driver version if there is mismatch it will download the appropriate version.
		
		WebDriver driver=new ChromeDriver();        //It will launch chrome
		
		driver.get("https://dbatu.ac.in/");    //enter url
		
		driver.manage().window().maximize();
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Departments"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Basic Sciences & Humanities"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Department of English")).click();
	}

}
