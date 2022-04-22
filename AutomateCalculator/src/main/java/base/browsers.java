package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsers {
	
	
	public WebDriver driver;
   public FileInputStream path;
	
	public WebDriver initializedriver() throws IOException 
	{
	 path = new FileInputStream("C:\\Users\\Nikhil\\eclipse-workspace\\MavenProjectDemo\\data.properties");  
        Properties prop = new Properties();
		prop.load(path);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();		
		}
		  
	return driver;
	}
}
				


