package Com.Wipro.money.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Wipro.money.Base.Testbase;

public class LoginPage extends Testbase
{
	@FindBy(id="email")
	WebElement Emailaddress;
	
	@FindBy(name="pass")
	WebElement Password;
	
	@FindBy(xpath="//a[@role='button']")
	WebElement CreateNewAccount;
	
	@FindBy(name="firstname")
	WebElement Firstname;
	
	@FindBy(name="lastname")
	WebElement Surname;
	
	@FindBy(xpath="//label[text()='Female']")
	WebElement Femaleradio;
	
	@FindBy(xpath="//select[@id='day']")
	public WebElement Day_Drop;
	
	@FindBy(name="birthday_month")
	public WebElement Month_Drop;
	
	@FindBy(name="birthday_year")
	public WebElement Year_Drop;
	
	public LoginPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle()
	{
		String t=driver.getTitle();
		return t;
	}
	
	public String VerifyUrl()
	{
		String u=driver.getCurrentUrl();
		return u;
	}
	
	public void VerifyEmail(String username)
	{
		Emailaddress.sendKeys(username);
	}
	
	public void VerifyPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void VerifyCreatenewaccount()
	{
		CreateNewAccount.click();
	}
	
	public String VerifyCreate()
	{
		String t = CreateNewAccount.getText();
		return t;
	}
   
	public void VerifyFirstname(String name)
	{
		Firstname.sendKeys(name);
	}
	
	
	public void VerifySurname(String name)
	{
		Surname.sendKeys(name);
	}
	
	public boolean Verifyradio()
	{
		return Femaleradio.isDisplayed();
	}

}
