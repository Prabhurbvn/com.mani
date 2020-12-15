package Com.Wipro.money.Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Com.Wipro.money.Base.Testbase;

public class Testutil extends Testbase
{
   public static void Maximize()
   {
	   driver.manage().window().maximize();
   }
   
   public static void Implicitwait()
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }
   
   public static void VerifyDropdown_Day(WebElement day,int d)
   {
	   Select se=new Select(day);
	   se.selectByIndex(d);
   }
   
   public static void VerifyDropdown_Month(WebElement month,String m)
   {
	   Select s=new Select(month);
	   s.selectByVisibleText(m);;
   }
   
   public static void VerifyDropdown_Year(WebElement year,String y)
   {
	   Select kk =new Select(year);
	   kk.selectByValue(y);
   }
   
   public static void Takes()
   {
	   try
	   {
	   File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(src, new File(".//src//main//java//Com//Wipro//money//Screen//fb"+System.currentTimeMillis()+".jpg"));
	   }
	   catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
   }
}
