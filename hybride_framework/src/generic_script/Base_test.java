package generic_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base_test  implements Framework_const1 {
	public WebDriver driver;
	@BeforeMethod
	public void Openapp() throws InterruptedException
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		//launch the browser
		driver.manage().window().maximize();
		//maximizing the window
		driver.get(base_url);
		
	}
	@AfterMethod
	public void Closeapp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_tss.getphoto(driver);
		}
		driver.close();
	}

}
