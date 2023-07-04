package generic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepom {
	public WebDriver driver;
	public Basepom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
