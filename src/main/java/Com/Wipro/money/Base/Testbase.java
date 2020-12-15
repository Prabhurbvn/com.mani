package Com.Wipro.money.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.Wipro.money.Utils.Testutil;

public class Testbase 
{
	File f;
	FileInputStream fis;
	public static WebDriver driver;
	Properties pro;
	
	public Testbase()
	{
		try
		{
		f=new File(".//src//main//java//Com//Wipro//money//Config//Config.Properties");
		fis =new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void Open()
	{
		String browser=pro.getProperty("browsername");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));
			 driver=new ChromeDriver();
			 
		}
		
		 else if(browser.equalsIgnoreCase("Firefox"))
		   {
			    System.setProperty("webdriver.gecko.driver", pro.getProperty("geckopath"));
			    driver=new FirefoxDriver();
		   }
		
		 else if(browser.equalsIgnoreCase("IE"))
		 {
			 System.setProperty("webdriver.gecko.driver", pro.getProperty("iepath"));
			 driver=new FirefoxDriver(); 
		 }
		 else
		   {
			   System.out.println("Given browsername is wrong");
		   }
		driver.get(pro.getProperty("url"));
		Testutil.Maximize();
		Testutil.Implicitwait();
		Testutil.Takes();
	}
	
	
	

}
