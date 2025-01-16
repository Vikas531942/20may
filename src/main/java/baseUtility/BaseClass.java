package baseUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass 
{
	public static WebDriver driver;
	 public void launchUrl(String url,String browser)
	 {
		 if(browser.equals("chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		 else if(browser.equals("edge"))
		 {
         driver=new EdgeDriver();
		 }
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 
         
	 
}
