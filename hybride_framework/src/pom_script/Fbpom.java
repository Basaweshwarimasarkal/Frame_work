package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.Basepom;

public class Fbpom extends Basepom {
	@FindBy(id="email")
	private WebElement unField;
	@FindBy(id="pass")
	private WebElement pwdField;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public Fbpom(WebDriver driver)
	{
		super(driver);
	}
	
	public void passun(String un)
	{
		unField.sendKeys(un);
	}
	public void passpwd(String pwd)
	{
		pwdField.sendKeys(pwd);
	}
	public void btn()
	{
		loginbtn.click();
	}


}
