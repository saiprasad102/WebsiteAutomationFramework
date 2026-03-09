package PageClass.SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
	WebDriver driver;
	
	// Constructor
		public Frames (WebDriver driver) {
			this.driver = driver;
		}
		
	// Locators 	
		By Switchto = (By.xpath("//a[text()='SwitchTo']"));
		By Frames = (By.xpath("//a[text()='Frames']"));
	  // NestedFrames	
		By NestedFrames = (By.xpath("//a[text()='Iframe with in an Iframe']"));
		// Step 1: Switch to parent iframe
		By ParentFrame = (By.xpath("//iframe[@src='MultipleFrames.html']"));
		// Step 2: Switch to child iframe inside parent
		By ChildFrame = (By.tagName("iframe"));
		// Step 3: Interact with elements inside child iframe
		By IframeDemoTextBox = (By.xpath("//input[@type='text']"));
		
//		By SingleFrameLocator = By.xpath("//iframe[@id='singleframe']");
//	    By SingleFrameInput = By.xpath("//input[@type='text']");
	//	
		
		
		
	// Methods
		public void enterSwitchTo(String switchto){
	  	  driver.findElement(Switchto).click();;
	  	 
	    }
		
		public void enterFrames(String frame) {
			driver.findElement(Frames).click();
		}
		
	  // NestedFrames	
		public void enterNestedFrames(String nestframe) {
			driver.findElement(NestedFrames).click();
		}
		
	// Step 1: Switch to parent iframe
		public void enterParentFrame(String parentframe) {
			WebElement parentFrame = driver.findElement(ParentFrame);
			driver.switchTo().frame(parentFrame);
		}
		

		// Step 2: Switch to child iframe inside parent
		public void enterChildFrame(String childframe) {
			WebElement childFrame = driver.findElement(ChildFrame);
			driver.switchTo().frame(childFrame);
		}
		
		// Step 3: Interact with elements inside child iframe
		public void enterIframeDemoTextBox(String iframetextbox) {
			driver.findElement(IframeDemoTextBox).click();
			driver.findElement(IframeDemoTextBox).sendKeys(iframetextbox);
		}
		
		
		
		
		
		
		
		
		
	//   
//		public void enterSingleFrame(String siframe){
//		 // switchto frames
//		  WebElement frame =  driver.findElement(SingleFrameLocator);
//		  driver.switchTo().frame(frame);
//		  
//		  
//		  WebElement input = driver.findElement(SingleFrameInput);
//		  input.sendKeys(siframe);
//	  	 
//	    }




	

}
