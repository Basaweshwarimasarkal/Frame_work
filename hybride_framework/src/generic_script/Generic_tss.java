package generic_script;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_tss {
	public static void getphoto(WebDriver driver) throws IOException
	{
		String photo="./photos/";
		Date d=new Date(0);
		String d1=d.toString();
		String d2 = d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src, dst);
		
	}


}
