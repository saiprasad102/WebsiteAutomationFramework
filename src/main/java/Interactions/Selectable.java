package Interactions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class Selectable {
	WebDriver driver;
	
// Constructor
	public Selectable (WebDriver driver) {
		this.driver = driver;
	}
	

// Locators 
				//  1. Selectable
	By Interaction = (By.xpath("//a[text()='Interactions ']"));
	By Selectable  = (By.xpath("//a[text()='Selectable ']"));
	By DefaultFunc = (By.xpath("//b[text()='Sakinalium - Readability']"));
	By SelectReadability = (By.xpath("//li[@class = 'ui-widget-content selected']"));
	
					// 2. Serialize 	
	By Serialize = (By.xpath("//a[text()='Serialize ']"));
	By SerialSelectRead = (By.xpath("//ul[@class='SerializeFunc']/li/b[text()='Sakinalium - Readability']"));
  // Clicking, it shows a message
	By FeedbackLableText = (By.xpath("//p[@id='feedback']/span[1]"));
	By FeedbackValueText = (By.xpath("//p[@id='feedback']/span[@id='result']"));
	
	public String label;
	public String value;
	
//   Methods	
				//  1. Selectable
	public void ClickInteraction() {
		driver.findElement(Interaction).click();
	}
		
	public void ClickSelectable() {
		driver.findElement(Selectable).click();
	}
		
	public void ClickDefaultFunc() {
		driver.findElement(DefaultFunc).click();
	}
	
	public void ClickSelectReadability() {
		driver.findElement(SelectReadability).click();
	}
	
				// 2. Serialize 
	public void ClickSerialize() {
		driver.findElement(Serialize).click();
		
		
	}
	
	public void ClickSerialSelectRead() {
		driver.findElement(SerialSelectRead).click();
	}
	
	public void CheckLableAndValue() {
		label = driver.findElement(FeedbackLableText).getText();
		value = driver.findElement(FeedbackValueText).getText().trim();

	    Assert.assertEquals("You've selected:", label);
	    Assert.assertEquals("Readability", value);
		
	    
	    
	    
//	    Assert.assertEquals("You've selected:", label, "You've select:");
//	    Assert.assertEquals("Readability", value, "Read");
//	  // Get the texts
//	    String label = driver.findElement(FeedbackLableText).getText().trim();
//	    String value = driver.findElement(FeedbackValueText).getText().trim();		
//		driver.findElement(FeedbackLableText).getText();
//		driver.findElement(FeedbackValueText).getText();
	}
	
	

}
