package More;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

	    public class DynamicData {

	        WebDriver driver;
	        WebDriverWait wait;
	        
	     // Constructor
			public DynamicData (WebDriver driver) {
				this.driver = driver;
			}

	        // Locators
	        By clickMore = By.xpath("//a[contains(text(),'More')]");
	        By clickDynamicData = By.xpath("//a[contains(text(),'Dynamic Data')]");
//	        By clickGetDynamicData = By.id("save");
	        By clickGetDynamicData = By.xpath("//button[contains(text(),'Get Dynamic Data')]");
//	        By loadingDivs = By.xpath("//div[@id='loading']"); // all dynamic user divs
//	        By userImageRelative = By.xpath(".//img");          // relative to div

//	        // Constructor
//	        public DynamicData(WebDriver driver) {
//	            this.driver = driver;
//	            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        }
	        public void moreclick() {
				driver.findElement(clickMore).click();
				driver.findElement(clickDynamicData).click();
				driver.findElement(clickGetDynamicData).click();
//				driver.findElement(loadingDivs);
//				WebElement button = wait.until(
//				        ExpectedConditions.elementToBeClickable(By.id("save"))
//				);

//				button.click();
			}
	        
	        public void GetDeatils() {
	        	
	        	

	              
	              // Locate the image element
	              WebElement image = driver.findElement(By.tagName("img"));

	              // Get the 'src' attribute (the image URL)
	              String imageUrl = image.getAttribute("src");
              
	              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	              WebElement dataDetails = wait.until(
	                      ExpectedConditions.visibilityOfElementLocated(By.id("loading"))
	              );

	              String divText = dataDetails.getText();

	              String firstName = divText.split("First Name : ")[1].split("\n")[0].trim();
	              String lastName = divText.split("Last Name : ")[1].trim();

	              System.out.println("First Name: " + firstName);
	              System.out.println("Last Name: " + lastName);
	              
              
			}
	    }
		
		
		
		
		

