package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();   
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:/Users/anu/Desktop/Ravi salary/Ravi resume.html");

	}
}
