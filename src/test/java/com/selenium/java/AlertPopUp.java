package com.selenium.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();   
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("proceed")).click();   //click on sign in button
		Thread.sleep(5000);								 //wait or hold alert popup for 5 sec
		Alert alert=driver.switchTo().alert();            //switches to the alert tab
	System.out.println(alert.getText());                 //prints alert msg
	String text=alert.getText();
	
	//validation 
	if(text.equals("Please enter a valid user name"))
	{
		System.out.println("Correct alert msg");
	}
	else 
	{
		System.out.println("In-Correct alert msg");
	}
	
	alert.accept();										//accept or click on ok button
	//alert.dismiss();									//dismis or click on cancel button
	driver.quit();
	}

}
