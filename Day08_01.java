package com.example.toy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day08_01 {
	public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        WebElement wb=driver.findElement(By.id("draggable"));
        WebElement ws1=driver.findElement(By.id("droppable"));
        Actions ac=new Actions(driver);
        ac.clickAndHold(wb).release(ws1).build().perform();
        Thread.sleep(5000);
        
        
        
        
}
}
