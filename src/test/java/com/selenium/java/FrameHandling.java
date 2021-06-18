package com.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();      //---it will automatically match chrome version and 
		//chrome driver version if there is mismatch it will download the appropriate version.
		
		WebDriver driver=new ChromeDriver();        //It will launch chrome
		
		driver.manage().window().maximize();      //maximize the windows
		//driver.manage().deleteAllCookies();      //delete all cookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		driver.get("https://classic.freecrm.com/index.html?e=1");    //enter url
		
	driver.findElement(By.name("username")).sendKeys("naveenk");
	driver.findElement(By.name("password")).sendKeys("test@123");
			
	driver.findElement(By.xpath("//*[@id=\"menu-item-567\"]/a")).click();
	Thread.sleep(3000);
	
	driver.switchTo().frame("mainpanel");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	
	}

}
