package testNGpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pack.BaseTest;


public class RadioButton1 extends BaseTest
{
	
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String bytpe) throws Exception 
	{
		System.out.println("startProcess");
	    init();
	    test = report.createTest(this.getClass().getName());
		test.log(Status.PASS, "Initiating the Property Files...");
				
		launch(bytpe);
		test.log(Status.INFO, "Opened the Browser :- " + p.getProperty("chromebrowser"));
						
		navigateUrl("radiourl");
		test.log(Status.PASS, "Navigated to app :-" + childprop.getProperty("radiourl"));
	 }
	
	
	@Test
	public void radioButtonTest()
	{
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("endProcess");
	  report.flush();
	  driver.quit();
  }
	
}
