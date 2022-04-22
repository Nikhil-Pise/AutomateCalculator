package FunctionalTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.browsers;
import dataProvider.dataProviderData;
import pageobjects.AmazonCreateAccountobject;
import pageobjects.Keysobject;

public class operations extends browsers {
	
	
public WebDriver driver;
	
	@BeforeClass
	public void RunBrowser() throws IOException
	{
		driver = initializedriver();
		driver.get("https://www.calculator.net/");
	}
	
	@Test(priority = 1)
	@Parameters({"n1","n2","result"} )
	public void Multiplication(String n1, String n2, String result ) throws InterruptedException
	{
		
	Actions ent = new Actions(driver);
	ent.click().sendKeys(n1).build().perform();
	Keysobject keyset = new Keysobject(driver);
	keyset.Multiply().click();
	ent.click().sendKeys(n2).build().perform();
	
	String output =keyset.Output().getText();
	
	System.out.println("Output is :" + output);
	System.out.println("Expected result is :" + result);
	
	Assert.assertEquals(output,result);
	
	Thread.sleep(5000);
	keyset.Clean().click();
	}

	@Test(priority = 2)
	@Parameters({"n1","n2","result"})
	public void Division(String n1, String n2, String result) throws InterruptedException
	{
		
		Actions ent = new Actions(driver);
		ent.click().sendKeys(n1).build().perform();
		Keysobject keyset = new Keysobject(driver);
		keyset.Divide().click();
		ent.click().sendKeys(n2).build().perform();
		
		String output =keyset.Output().getText();
		
		System.out.println("Output is :" + output);
		System.out.println("Expected result is :" + result);
		
		Assert.assertEquals(output,result);
		
		Thread.sleep(5000);
		keyset.Clean().click();
	}
	
	@Test(priority = 3)
	@Parameters({"n1","n2","result"} )
	public void Addition(String n1, String n2, String result ) throws InterruptedException
	{
		
	
		
	
	Actions ent = new Actions(driver);
	ent.click().sendKeys(n1).build().perform();
	Keysobject keyset = new Keysobject(driver);
	keyset.Addition().click();
	ent.click().sendKeys(n2).build().perform();
	
	String output =keyset.Output().getText();
	
	System.out.println("Output is :" + output);
	System.out.println("Expected result is :" + result);
	
	Assert.assertEquals(output,result);
	
	Thread.sleep(5000);
	keyset.Clean().click();
	}
	
	@Test(priority = 4)
	@Parameters({"n1","n2","result"} )
	public void Substraction(String n1, String n2, String result ) throws InterruptedException
	{
		
	
		
	
	Actions ent = new Actions(driver);
	ent.click().sendKeys(n1).build().perform();
	Keysobject keyset = new Keysobject(driver);
	keyset.Substract().click();
	ent.click().sendKeys(n2).build().perform();
	
	String output =keyset.Output().getText();
	
	System.out.println("Output is :" + output);
	System.out.println("Expected result is :" + result);
	
	Assert.assertEquals(output,result);
	
	Thread.sleep(5000);
	keyset.Clean().click();
	}
	
	
	

}
