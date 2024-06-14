package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod_Googlesearch {
	
	
	
	WebDriver driver;
	//GoogleSearchPage objectrepo;
	
	
	@BeforeTest
	public void beforetest() {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
   @Test
   public void searchoperation() throws InterruptedException {
	   Thread.sleep(5000);
	   GoogleSearchPage obj=new GoogleSearchPage(driver);
	   obj.SearchGogle();
   }
   
   @Test
   public void getTitlee() throws InterruptedException {
	   Thread.sleep(5000);
	   GoogleSearchPage obj=new GoogleSearchPage(driver);
	   obj.getTitle();
   }
   

   
   
   /*
   @Test
   public void VerifyandAccessFacebook()throws InterruptedException {
	   objectrepo =new GoogleSearchPage(driver);
	   //GoogleSearchPage pagep=new GoogleSearchPage(driver);
	   
	   Thread.sleep(5000);
	   objectrepo.clickFacebook();
	  // pagep.clickFacebook();
   }
   */
    
   @AfterTest
   public void aftertest() {
	   //driver.quit();
   }

}

//============================================================================================================

/*
package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod_Googlesearch {
	
	
	
	WebDriver driver;
	GoogleSearchPage objectrepo;
	
	
	@BeforeTest
	public void beforetest() {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	}
	
   @Test
   public void searchoperation() throws InterruptedException {
	   GoogleSearchPage page=new GoogleSearchPage(driver);
	   page.SearchGogle("facebook");
	   Thread.sleep(5000);
	   
   }
   @Test
   public void VerifyandAccessFacebook()throws InterruptedException {
	   objectrepo =new GoogleSearchPage(driver);
	   //GoogleSearchPage pagep=new GoogleSearchPage(driver);
	   
	   Thread.sleep(5000);
	   objectrepo.clickFacebook();
	  // pagep.clickFacebook();
   }
    
   @AfterTest
   public void aftertest() {
	   //driver.quit();
   }

}
*/
