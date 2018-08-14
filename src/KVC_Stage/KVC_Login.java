package KVC_Stage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import KVC_Stage.*;

public class KVC_Login extends KVC_BeforeAfter{
	
	public static void main(String[] args) {}
    
	
	
		
	@Test
	public void Login() {		
		signIn();
		}




	

   
    @Test
	public void Logout() {
    	
    	signIn();
		
		KVC_BeforeAfter.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		KVC_BeforeAfter.driver.findElement(By.linkText("Account")).click();
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"logout\"]/a/span")).click();
	}
	
    
    private void signIn() {
		KVC_BeforeAfter.driver.navigate().to(KVC_Credentials.BASEDSTAGEURL);
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(KVC_Credentials.LOGIN);
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(KVC_Credentials.PASSWORD);
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"sign-in-submit\"]")).click();
	    }
}
   
