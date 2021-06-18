package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropBox {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();   
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236042%7Ce%7Cfacebook%27%7C&placement&creative=318504236042&keyword=facebook%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-362360550869%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwzYGGBhCTARIsAHdMTQwaVWZvmD5q141A1-OycS3-Qq2Neoc3TL_vZW1nrAjuDuhMhYlbANMaAh6fEALw_wcB/");
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//By Id---prioritty 1
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("15");
		
		Select select1=new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("May");
		
		Select select2=new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1995");
		
		//By name
		/*
		 * Select select=new Select(driver.findElement(By.name("birthday_day")));
		 * select.selectByVisibleText("15");
		 * 
		 * Select select1=new Select(driver.findElement(By.name("birthday_month")));
		 * select1.selectByVisibleText("May");
		 * 
		 * Select select2=new Select(driver.findElement(By.name("birthday_year")));
		 * select2.selectByVisibleText("1995");
		 */
	}

}
