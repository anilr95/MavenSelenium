package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locaters {

	public static void main(String[] args) 
	{
		
		//1.By Id-----p1 
	
		/*
		 * //System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\anu\\Desktop\\chromedriver\\chromedriver.exe");
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * //driver.get(
		 * "http://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F/");
		 * 
		 * //System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.findElement(By.id("firstname")).sendKeys("Anil");
		 * driver.findElement(By.id("lastname")).sendKeys("Rao");
		 * driver.findElement(By.id("Email")).sendKeys("anil@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("anil123");
		 * driver.findElement(By.id("showpassword")).click();;
		 */	
		
		
		//2.By Xpath----p2     
		//absolute xpath should not be used----/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input
		//only relative xpath used
		WebDriverManager.chromedriver().setup();   
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&prevRID=D6P8BBT1Q3RFTB5F2RQ8&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		System.out.println(driver.getTitle());

		
		  driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Anil");
		  
		  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("anil@gmail.com");
		  
		  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("anil@123");
		  
		  driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("anil@123");
		  
		  driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/div[6]/a")).click();
		  
		 //3.By name----p3
			/*
			 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
			 * 
			 * driver.get(
			 * "https://en-gb.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236042%7Ce%7Cfacebook%27%7C&placement&creative=318504236042&keyword=facebook%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-362360550869%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwzYGGBhCTARIsAHdMTQwaVWZvmD5q141A1-OycS3-Qq2Neoc3TL_vZW1nrAjuDuhMhYlbANMaAh6fEALw_wcB/"
			 * ); System.out.println(driver.getTitle());
			 * 
			 * driver.findElement(By.name("firstname")).sendKeys("Anil");
			 * driver.findElement(By.name("lastname")).sendKeys("Rikshe");
			 * driver.findElement(By.name("reg_email__")).sendKeys("8275826483");
			 * driver.findElement(By.name("reg_passwd__")).sendKeys("anil@95");
			 * 
			 */
		  
		//4.linktext: only for link text
		//driver.findElement(By.linkText("Log In")).click();
		
		//5.partiallinktext: not usefull---dont use this use linktext
		//driver.findElement(By.partialLinkText("Cookie Policy")).click();
		
		//6.CSS selector----p2
		  //if id is there --#id
		  //if class is there---.class
		  
		//driver.findElement(By.cssSelector("#u_0_n_7Y")).sendKeys("sunil");  
		//or
		//driver.findElement(By.cssSelector("#id value")).sendKeys("sunil");
		
		//7.By clasname:can be diff or duplicate or same so dont use it ---p4

		//driver.findElement(By.className("58mg _5dba _2ph-")).sendKeys("sunil");
	}

}
