package runner_script;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_script.Base_test;
import pom_script.Fbpom;

public class Runnerclass extends Base_test {
	@Test(dataProvider = "testData")
	public void test(String d1,String d2) throws InterruptedException
	{
		Fbpom p=new Fbpom(driver);
		p.passun(d1);
		p.passpwd(d2);
		Thread.sleep(2000);
		p.btn();
		//Assert.fail();
		
	}
	@DataProvider(name="testData")
	
	public Object[][] createData1()
	{
		return new Object[][]
		{
			{"basava","admin"},
			{"basava1","manager"},
		};
	}
}
