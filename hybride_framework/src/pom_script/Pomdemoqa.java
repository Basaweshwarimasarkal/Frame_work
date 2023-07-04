package pom_script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomdemoqa {
	@FindBy(id="firstName")
	private WebElement fn;
	@FindBy(id="lastName")
	private WebElement ln;
	@FindBy(id="userEmail")
	private WebElement email;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement radio;
	@FindBy(id="userNumber")
	private WebElement num;
	@FindBy(id="dateOfBirthInput")
	private WebElement Dob;
	@FindBy(xpath="//div[text()='28']")
	private WebElement dobb;
	@FindBy(xpath="//input[@id='subjectsInput']")
	private WebElement subject;
	@FindBy(xpath="//label[text()='Music']")
	private WebElement hobby;
	@FindBy(id="uploadPicture")
	private WebElement upload;
	@FindBy(id="currentAddress")
	private WebElement curadd;
	@FindBy(id=" css-1wy0on6")
	private WebElement statee;
	//@FindBy(id="react-select-3-input")
	//private WebElement state;
	
	
	public Pomdemoqa(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void firsttname(String sh)
	{
	  fn.sendKeys(sh);	
	}
	public void lastname(String f)
	{
	  ln.sendKeys(f);	
	}
	public void emailadd(String e)
	{
	  email.sendKeys(e);	
	}
	
	public void radiobutton()
	{
	  radio.click();
	}
	public void number()
	{
	  num.sendKeys("9876543210");
	}
	public void dateob()
	{
		
	  Dob.click();
	}
	public void date()
	{
		dobb.click();
	}
	public void subjj(String sh) throws AWTException
	{
			subject.click();
			subject.sendKeys(sh);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void hobbyy()
	{
	  hobby.click();
	}
	public void upload()
	{
		upload.sendKeys("D://image");
	}
	
	public void address()
	{
		curadd.sendKeys("gulbarga karnataka india");
	}
	public void dropdown()
	{
		Select s=new Select(statee);
		statee.click();
		s.selectByIndex(1);
	}
	/*public void citydropdown()
	{
		Select s=new Select(cityy);
		s.selectByIndex(1);
		s.selectByVisibleText(null);
	}*/
	
	
	
	
	
	

}
