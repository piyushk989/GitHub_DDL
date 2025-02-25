package commonFIles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.Assertion;

public class CommonFunctionality {
 public static WebDriver drv;
 public static String Exp="";
 public static String Act="";
 public static WebDriver openBrowser(String url)
 {
	 drv= new ChromeDriver();
	 drv.manage().window().maximize();
	 drv.get(url);
	 return drv;
}
 
 public static void textFunction(String LocatorType,String LocatorValue,String testData)
 {
 	if(LocatorType.equalsIgnoreCase("name"))
 	{
 		drv.findElement(By.name(LocatorValue)).clear();
 		drv.findElement(By.name(LocatorValue)).sendKeys(testData);
 		
 	}
 	if(LocatorType.equalsIgnoreCase("xpath"))
 	{
 		drv.findElement(By.xpath(LocatorValue)).clear();
 		drv.findElement(By.xpath(LocatorValue)).sendKeys(testData);
 	}
 	if(LocatorType.equalsIgnoreCase("id"))
 	{
 		drv.findElement(By.id(LocatorValue)).clear();
 		drv.findElement(By.id(LocatorValue)).sendKeys(testData);
 	}
 }
  public static void clickFunction(String LocatorType,String LocatorValue)
  {
	if(LocatorType.equalsIgnoreCase("name"))
	{
		drv.findElement(By.name(LocatorValue)).click();
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		drv.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);
	}
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		drv.findElement(By.xpath(LocatorValue)).click();
	}
  }
  public static void titleFunction(String Exp_ttl)
  {   
	  
	  String Act_ttl=drv.getTitle();
	  try
	  {
		  Assert.assertEquals(Act_ttl,Exp_ttl,"Title not matching");
	  }
      catch(AssertionError err)
	  {
    	  System.out.println(err.getMessage());
	  }
  }
  @SuppressWarnings("deprecation")
public static void supplierNumber(String LocatorType,String LocatorValue)
  { 
	    if(LocatorType.equalsIgnoreCase("id"))
		{
			Exp=drv.findElement(By.id(LocatorValue)).getAttribute("value");
		}
	    if(LocatorType.equalsIgnoreCase("name"))
		{
			Exp=drv.findElement(By.name(LocatorValue)).getAttribute("value");
		}
	    if(LocatorType.equalsIgnoreCase("xpath"))
		{
			Exp=drv.findElement(By.xpath(LocatorValue)).getAttribute("value");
		}
	  
  }
  
  public static void validateSupp() throws Exception
  {
	  if(!drv.findElement(By.xpath("//input[@id='psearch']")).isDisplayed())
	  { 
		  drv.findElement(By.xpath("//span[@data-caption='Search']")).click();
		  drv.findElement(By.xpath("//input[@placeholder='Search'])")).clear();
		  drv.findElement(By.xpath("//input[@id='psearch']")).sendKeys(Exp);
		  Thread.sleep(3000);
		  drv.findElement(By.id("btnsubmit")).click();
		  
		  Act =drv.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span")).getText();
			if(Act.equals(Exp))
			{
				Reporter.log("Supplier Number found in Table::"+Exp+"      "+Act,true);
				
			}
			else
			{
				Reporter.log("Supplier Number Not found in Table::"+Exp+"      "+Act,true);
			}
		   
		  
		   
		  
	  }
  }
	 	
}
