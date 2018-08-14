package kvc_base;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.SendKeysAction;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTestBase2 {
	
	public static WebDriver driver;
	public static String urlSite = "https://dev-library.kvcentral.com/";
	public static String driverPath = "c:\\Repo\\selenium_lib\\";
	
	public static void main(String[] args) {
		
		}

	
	@Test
	public void openUrl() {
		//this.urlSite = urlSite;
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(urlSite);
	}
	
	@Test
	public void Login() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mcseem@ukr.net");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("22H1PB2a");
	
		driver.findElement(By.xpath("//*[@id=\"sign-in-submit\"]")).click();
	}
		
	@Test
	public void chooseAccount() {
		//WebElement mySelectElement  = driver.findElement(By.name("accountType"));
		//Select dropdown = new Select(mySelectElement);
		Select dropdown = new Select(driver.findElement(By.id("//*[@id=\"account-type\"]")));
		dropdown.deselectByIndex(1);
		System.out.println(dropdown.toString());
		
		//dropdown.selectByVisibleText("KV - demo11");  dropdown.getFirstSelectedOption()   driver.findElement(By.cssSelector("#account-type"))
		//driver.findElement()   (By.name("accountType")).click();
	
	}
		
	
}

