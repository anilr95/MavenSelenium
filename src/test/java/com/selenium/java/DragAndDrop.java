package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();      
		
		WebDriver driver=new ChromeDriver();        //It will launch chrome
		
		driver.get("https://jqueryui.com/droppable/");    //enter url    
		
		driver.switchTo().frame(0);              //switch to frames if it is present
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
		

	}

}
