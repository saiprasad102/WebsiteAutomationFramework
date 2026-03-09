package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	WebDriver driver;
	
// Constructor
		public Resizable (WebDriver driver) {
			this.driver = driver;
		}	
	
//	Locators	
		By Interaction = (By.xpath("//a[text()='Interactions ']"));	
		By Resizables = (By.xpath("//a[text()='Resizable']"));
		
	
		public void ClickResizable() {
			driver.findElement(Interaction).click();
			driver.findElement(Resizables).click();
			WebElement resizeHandle = driver.findElement(By.xpath("//div[contains(@class, 'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se')]"));
			
			Actions action = new Actions(driver);
			action.clickAndHold(resizeHandle)
	        .moveByOffset(300, 100).release().perform();
			
			
			
			
		}
	
	
	

}
