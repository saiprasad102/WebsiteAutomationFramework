package PageClass.RegisterFrom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Register_Signup {
	WebDriver driver;
	
	// Constructor
		public Register_Signup (WebDriver driver) {
			this.driver = driver;
		}
		
		
		
	// Locators    
	    //FirstName
	      By FirstName = (By.xpath("//input[@placeholder='First Name']"));
	    //LastName 
	      By LastName = (By.xpath("//input[@placeholder='Last Name']"));
	    //Address  
	      By Address = (By.cssSelector("textarea[ng-model='Adress']"));
	    //EmailId
	      By EmailId= (By.cssSelector("input[ng-model='EmailAdress']"));
	    // Gender
	      By Gender = (By.xpath("//input[@value='Male']"));
//	    // Language  
//	      By Language = (By.xpath("//div[@id='msdd']"));
//	      By Lang = (By.xpath("//a[text()='Arabic']"));
	      
	      
	 // Methods
	     
	      public void enterDeatils(){
	    	  driver.findElement(FirstName).sendKeys("sai");
	    	  driver.findElement(LastName).sendKeys("prasad");
	    	  driver.findElement(Address).sendKeys("Your address text here");
	    	  driver.findElement(EmailId).sendKeys("saiprasadp555@gmail.com");
	    	  driver.findElement(Gender).click();
	    	  WebElement lang = driver.findElement(By.xpath("//a[text()='Arabic']"));
	    	  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", lang);
	    	  
	      }
	      
	     
	      
	      
	      
		
		
		//public static void main(String[] args) {
			
			
			

	        
			//FirstName & LastName
			//obj.driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sai");

			//obj.driver.findElement(By.xpath("//input[@placeholder='Last Name']")).
			//sendKeys("prasad");

			//Address
			//obj.driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Your address text here");

	        


			//Phone Number

			//obj.driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("saiprasadp555@gmail.com");

			//Gender

			//obj.driver.findElement(By.xpath("//input[@value='Male']")).click();

			//obj.driver.findElement(By.xpath("//div[@id='msdd']")).click();

			//WebDriverWait wait = new WebDriverWait(obj.driver, Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='English']")));

			//obj.driver.findElement(By.xpath("//a[text()=\"Arabic\"]")).click();

		//}
		


}
