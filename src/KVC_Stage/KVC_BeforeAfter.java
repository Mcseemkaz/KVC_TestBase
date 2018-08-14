package KVC_Stage;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KVC_BeforeAfter {
	
	public static WebDriver driver;
	public static String driverPath = "c:\\Repo\\selenium_lib\\";
	
	@Before
	public void setUp() {
    	System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
}

	@After
	public void tearDown() {		   
		   if(driver!=null) {
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("Closing chrome browser");
				driver.quit();}   
		   }
		  
}