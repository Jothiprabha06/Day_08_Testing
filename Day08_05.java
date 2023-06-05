package com.example.toy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day08_05 {
	public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        WebElement value=driver.findElement(By.name("q"));
        value.sendKeys("Apple");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        String t1=driver.getTitle();
        String id1=driver.getWindowHandle();
        System.out.println(t1);
        System.err.println(id1);
        driver.switchTo().newWindow(WindowType.TAB);
        
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        WebElement value1=driver.findElement(By.name("q"));
        value1.sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        String t2=driver.getTitle();
        String id2=driver.getWindowHandle();
        System.out.println(t2);
        System.err.println(id2);
        driver.switchTo().newWindow(WindowType.TAB);
        

        driver.get("https://google.com/");
        driver.manage().window().maximize();
        WebElement value3=driver.findElement(By.name("q"));
        value3.sendKeys("Cucumber");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        String t3=driver.getTitle();
        String id3=driver.getWindowHandle();
        System.out.println(t3);
        System.err.println(id3);
        
        
        //to print total tabs opened
        Set<String>total=driver.getWindowHandles();
        System.out.println("Total tabs "+total.size());
        
}
}