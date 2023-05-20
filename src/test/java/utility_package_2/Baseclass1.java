package utility_package_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v106.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass1 {

	// constructor
			// methord for browser
			// methord for url
	
	public static WebDriver driver;
	public static Properties redpro;
	
	public Baseclass1() {
		
		try {
			FileInputStream redfile= new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\configuration_package_2\\red.Properties");
			redpro = new Properties();
			redpro.load(redfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("please check your code");
			e.printStackTrace();
		}
		
		
	}
	
	public void redvrowser() {
	String browser=	redpro.getProperty("RedBrowser1");
	if (browser.equalsIgnoreCase("edge browser")){
		
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/edgedriver/msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	else if (browser.equalsIgnoreCase("FF"));
	
	}
	public static void redurl(String url) {
		driver.get(redpro.getProperty("URLRED"));
		
	}
}
