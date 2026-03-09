package PageClass.RegisterFrom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	    // Language  
	      By Language = (By.xpath("//div[@id='msdd']"));
	      By Lang = (By.xpath("//a[text()='Arabic']"));
	      
	      
	 // Methods
	      public void enterFirstName(String fname){
	    	  driver.findElement(FirstName).sendKeys(fname);
	    	 
	      }
	      
	      public void enterLastName(String lname){
	    	  driver.findElement(LastName).sendKeys(lname);
	    	 
	      }
	      
	      public void enterAddress(String paddress){
	    	  driver.findElement(Address).sendKeys(paddress);
	    	 
	      }
	      
	      public void enterEmail(String emailid){
	    	  driver.findElement(EmailId).sendKeys(emailid);
	    	 
	      }
	      
	      public void enterGender(String genders){
	    	  driver.findElement(Gender).click();
	    	 
	      }
	      
	      public void enterLanguage(String langs){
	    	  driver.findElement(Language).click();
	    	  driver.findElement(Lang).click();
	    	 
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
