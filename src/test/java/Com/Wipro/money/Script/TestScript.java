package Com.Wipro.money.Script;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Wipro.money.Base.Testbase;
import Com.Wipro.money.Pages.LoginPage;
import Com.Wipro.money.Utils.Testutil;

public class TestScript extends Testbase
{
   LoginPage log;
   
   @BeforeTest(alwaysRun=true)
   public void Setup()
   {
	   Open();
	   log=new LoginPage();
   }
   
   @Test
   public void ValidateTitle()
   {
	   String str = log.VerifyTitle();
	   Assert.assertEquals(str, "Facebook – log in or sign up");
   }
   
   @Test
   public void ValidateUrl()
   {
	   String s = log.VerifyUrl();
	   Assert.assertEquals(s, "https://www.facebook.com/");
   }
   
   @Test
   public void ValidateCreatenew()
   {
	   log.VerifyCreatenewaccount();
   }
   
   @Test
   public void ValidateCreateAccount()
   {
	   String h = log.VerifyCreate();
	   Assert.assertEquals(h, "Create New Account");
   }
   
   @Test
   public void ValidateName()
   {
	   log.VerifyFirstname("roja");
   }
   
   @Test
   public void Validatesurname()
   {
	   log.VerifySurname("A");
   }
   
   @Test
   public void validateradio()
   {
	  boolean h =  log.Verifyradio();
	  Assert.assertTrue(h);
   }
   @Test
   public void ValidateDrop_Date()
   {
	   Testutil.VerifyDropdown_Day(log.Day_Drop, 5);
   }
   
   @Test
   public void ValidateDrop_Month()
   {
	   Testutil.VerifyDropdown_Month(log.Month_Drop, "Apr");
   }
   
   
   @Test
   public void ValidateDrop_Year()
   {
	   Testutil.VerifyDropdown_Year(log.Year_Drop, "1990");
   }
   
   @AfterTest
   public void Teardown()
   {
	   driver.close();
   }
}
