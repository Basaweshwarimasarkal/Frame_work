package runner_script;

import org.testng.annotations.Test;

import generic_script.Base_test;
import generic_script.Generic_DDT;
import pom_script.Fbpom;

public class Execlhybrid extends Base_test{
	@Test
	public void test() throws InterruptedException
	{
		String un = Generic_DDT.getdata("sheet1",0,0);
		String pwd = Generic_DDT.getdata("sheet1", 0, 1);
		Fbpom p=new Fbpom(driver);
		p.passun(un);
		p.passpwd(pwd);
		Thread.sleep(2000);
		p.btn();
				
	}
	
}
