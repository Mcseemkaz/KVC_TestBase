package KVC_Stage;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import KVC_Stage.KVC_BeforeAfter;
import KVC_Stage.KVC_Credentials;

public class KVC_Login{
	
	public static void main(String[] args) {}
    		
		
	@Test
	public void Login(){		
		signIn();
		}


    @Test
	public void Logout(){
    	signIn();
		signOut();
		}


	public void signOut(){
		KVC_BeforeAfter.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		KVC_BeforeAfter.driver.findElement(By.linkText("Account")).click();
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"logout\"]/a/span")).click();
		}
	
    
    public void signIn(){
		KVC_BeforeAfter.driver.navigate().to(KVC_Credentials.BASEDSTAGEURL);
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(KVC_Credentials.LOGIN);
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(KVC_Credentials.PASSWORD);
		KVC_BeforeAfter.driver.findElement(By.xpath("//*[@id=\"sign-in-submit\"]")).click();
	    }
}