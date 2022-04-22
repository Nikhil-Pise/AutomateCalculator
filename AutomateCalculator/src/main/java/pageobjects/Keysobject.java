package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Keysobject {
	
	public WebDriver driver;
	
	public Keysobject(WebDriver driver2) 
	{
		driver= driver2;
	}
	//number keys
	By zero = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]");
	By one = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]");
	By two = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]");
	By three = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]");
	By four = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]");
	By five = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]");
	By six = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]");
	By seven = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[1]");
	By eight = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]");
	By nine = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]");
	
	//operation keys
	By addition = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]");
	By substract = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]");
	By multiply = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]");
	By divide = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]");
	By equalsign = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]");
	By clean = By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]");
	
	// input and output
	By input = By.id("sciInPut");
	By output = By.id("sciOutPut");
	
	public WebElement One()
    {
      return driver.findElement(zero);
    }
    
    public WebElement Two()
    {
      return driver.findElement(two);
    }
    
    public WebElement Three()
    {
      return driver.findElement(three);
    }
    
    public WebElement Four()
    {
      return driver.findElement(four);
    }
    
    public WebElement Five()
    {
      return driver.findElement(five);
    }
    
    public WebElement Six()
    {
      return driver.findElement(six);
    }
    
    public WebElement Seven()
    {
      return driver.findElement(seven);
    }
    
    public WebElement Eight()
    {
      return driver.findElement(eight);
    }
    
    public WebElement Nine()
    {
      return driver.findElement(nine);
    }
    
    
    
    public WebElement Addition()
    {
      return driver.findElement(addition);
    }
    
    public WebElement Substract()
    {
      return driver.findElement(substract);
    }
    
    public WebElement Multiply()
    {
      return driver.findElement(multiply);
    }
    
    public WebElement Divide()
    {
      return driver.findElement(divide);
    }
    
    public WebElement Equalsign()
    {
      return driver.findElement(equalsign);
    }
    
    public WebElement Clean()
    {
      return driver.findElement(clean);
    }
    
    
    public WebElement Input()
    {
      return driver.findElement(input);
    }
    
    public WebElement Output()
    {
      return driver.findElement(output);
    }
    
}
