package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		Thread.sleep(10000);
		
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("philips");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("field-keywords")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("nav-input")).sendKeys("sony");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("LG");*/
		
		//driver.findElement(By.linkText("Best Sellers")).click();
		
		//driver.findElement(By.partialLinkText("Best Seller")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
		}
	}
}
