package runner_script;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_script.Base_test;
import pom_script.Pomdemoqa;

public class Demoqaform{
	
	@Test
	public void test() throws InterruptedException, AWTException
	{ 
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
		Pomdemoqa p=new Pomdemoqa(driver);
		p.firsttname("basaweshwari");
		p.lastname("masarkal");
		p.emailadd("basaweshwari@gmail.com");
		p.radiobutton();
		p.number();
		p.dateob();
		p.date();
		p.subjj("Maths");
		p.hobbyy();
		p.upload();
		p.address();
		p.dropdown();
		//p.citydropdown();
	}

}
