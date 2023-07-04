package runner_script;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Logreport {
	@Test
	public void test2()
	{
		BasicConfigurator.configure();
		Logger log=Logger.getLogger(this.getClass().getName());
		log.error("error");
		log.fatal("fatal");
		log.info("info");
	}
}
