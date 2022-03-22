package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDriver {
	public static WebDriver driver;
	
	public String projectPath = System.getProperty("user.dir");
	
	public SetDriver(){
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		driver=new ChromeDriver();
		
	}
	public static void navigatetoHome(){
		driver.get("www.macys.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);

	}
	

}
