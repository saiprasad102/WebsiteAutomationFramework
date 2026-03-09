package Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	WebDriver driver;
	
// Constructor
		public DragAndDrop (WebDriver driver) {
			this.driver = driver;
		}
//    Locators	
		By Interaction = (By.xpath("//a[text()='Interactions ']"));
		By SelectDragAndDrop = (By.xpath("//a[text()='Drag and Drop ']"));
		// 1. to select static----
		By SelectStatic = (By.xpath("//a[text()='Static '] "));
		By source = (By.xpath("//div[@class='col-xs-10 col-xs-offset-2']//preceding::img[@id='node']"));
	    By target = (By.xpath("//div[@class='col-xs-4 col-xs-offset-2']//preceding::div[@id='droparea']"));
		
		
		
		
//   Methods	
	
		public void ClickInteraction() {
			driver.findElement(Interaction).click();
		}
		
		public void ClickDragAndDrop() {
			driver.findElement(SelectDragAndDrop).click();
		}
		
		public void ClickStatic() {
			driver.findElement(SelectStatic).click();
		}
		
		
		public void StaticDragAndDrop() {      
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement source = wait.until(
	              ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-xs-10 col-xs-offset-2']//preceding::img[@id='node']")));

			WebElement target = wait.until(
	              ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-xs-4 col-xs-offset-2']//preceding::div[@id='droparea']"))
			);
	      
	      
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, target).perform();
		    
		    
		}
		

}
