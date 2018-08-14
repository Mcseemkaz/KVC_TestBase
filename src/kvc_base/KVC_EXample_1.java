package kvc_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KVC_EXample_1 {




	
 public static String driverPath = "c:\\Repo\\selenium_lib\\";
 public static WebDriver driver;
 
	public static void main(String []args) {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
	}
}
