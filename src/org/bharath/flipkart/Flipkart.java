package org.bharath.flipkart;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\code workspace\\Flipkart\\flipkart\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
				  
			  //WebElement btn = driver.findElement(By.xpath("//a[text()='Login & Signup']"));
			  //String a =btn.getText();
			  //System.out.println(a);
			  //btn.click();
			String pid = driver.getWindowHandle();
			  Set<String> allwindows = driver.getWindowHandles();
			  for (String aw : allwindows) {
				  if (!pid.equals(aw)) {
					  driver.switchTo().window(aw);
					
				}
				  
				 driver.findElement(By.xpath("//input [@class='_2zrpKA']")).sendKeys("bharath11eee007@gmail.com");
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//input [@type='password']")).sendKeys("baru24494");
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//button [@class='_2AkmmA _1LctnI _7UHT_c']")).click();
				Thread.sleep(3000);
				
				  
				  
			
		
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mi led tv");
		 
			driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
			
			  }
			
			
			  
			  
	}
			
			
			
		 
		 
		
		
		
		
		
	
}
