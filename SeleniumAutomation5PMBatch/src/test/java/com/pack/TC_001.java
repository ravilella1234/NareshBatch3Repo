package com.pack;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		launch("Chrome");
		
		navigateUrl("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		
		String psource = driver.getPageSource();
		System.out.println(psource);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		//driver.close();
		
		//driver.quit();
	}

}
