package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	    public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
		
	}

 By username=By.xpath("//input[@placeholder='Username']");
 By password=By.xpath("//input[@placeholder='Password']");
 //By facebook_link=By.xpath("//div[contains(text(),'Images')]");
 By login=By.xpath("//button[@type='submit']");
 
         public void SearchGogle() {
	       try {
		driver.findElement(username).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(password).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(login).click();
		Thread.sleep(5000);
		
	     }
	       catch(Exception e){
		System.out.println("exception catch "+ e.getMessage());		
	}
	 
	 	 
	 
 }
         public void getTitle() throws InterruptedException {
	 /*    String title= driver.getTitle();
	    System.out.println(title);
	    System.out.println("title is here ddd");
*/


String actualTitle = driver.getTitle();
String expectedTitle = "OrangeHRM";
assertEquals(expectedTitle,actualTitle);

	    
}


  
	 //try {
	
	 
	// driver.findElement(facebook_link).click();
	// System.out.println( driver.findElement(facebook_link).getText());
	// System.out.println("test is here...");
		
		// Thread.sleep(2000);
	// }
	// catch(Exception e) {
		
		// System.out.println("catch secons exp" + e.getMessage());
		 
	 
	 
	 
	 
 }
 

//=========================================================================================

//second p[rog
/*
package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
		
	}

 By searchbox=By.xpath("//textarea[@id='APjFqb']");
 By search_btn=By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']");
 //By facebook_link=By.xpath("//div[contains(text(),'Images')]");
 By facebook_link=By.xpath("//h3[normalize-space()='Facebook - log in or sign up']");
 
 public void SearchGogle(String searchinput) {
	try {
		driver.findElement(searchbox).sendKeys(searchinput);
		Thread.sleep(5000);
		driver.findElement(search_btn).click();
		Thread.sleep(5000);
		
	}
	catch(Exception e){
		System.out.println("exception catch "+ e.getMessage());		
	}
	 
	 //driver.findElement(search_btn).click();
	 	 
	 
 }
 public void clickFacebook() throws InterruptedException {
	 //try {
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].click()", facebook_link);
	 
	 //driver.findElement(facebook_link).click();
	// System.out.println( driver.findElement(facebook_link).getText());
	// System.out.println("test is here...");
		
		 Thread.sleep(2000);
	// }
	// catch(Exception e) {
		
		// System.out.println("catch secons exp" + e.getMessage());
		 
	 }
	 
	 
	 
 }

	*/


