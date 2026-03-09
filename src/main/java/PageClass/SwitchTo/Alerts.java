package PageClass.SwitchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
	WebDriver driver;
	
	// Constructor
		public Alerts (WebDriver driver) {
			this.driver = driver;
			}
		
		
		
	// Locators 
		By Switchto = (By.xpath("//a[text()='SwitchTo']"));
		By Alerts = (By.xpath("//a[text()='Alerts']"));
		By ClickAlertButton = (By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
		By AlertOkAndCancel = (By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));
		By ClickButtonOkCancel  = (By.xpath("//button[contains(text(), 'click the button to display a confirm box' )]"));
		By AlertWithTextBox  = (By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
		By EnterTextBox  = (By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
//		button[contains(text(), 'click the button to display a confirm box' )]
	//  alert.accept();
		
		
		
//	     Methods
		
		public void enterSwitchTo(String switchto){
		  	  driver.findElement(Switchto).click();;
		  	 
		}
		
		
		public void enterAlerts() {
			driver.findElement(Alerts).click();
		}
		
		public void clickClickAlertButton(String alertbutton) {
			driver.findElement(ClickAlertButton).click();
		}
		
		public void SwitchToAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			
		}
		
		public void AlertWithOkCancel() {	    	    	   
		    driver.findElement(AlertOkAndCancel).click();
			driver.findElement(ClickButtonOkCancel).click();
			// Switch to alert
			Alert alert = driver.switchTo().alert();
			// Dismiss the alert
			alert.dismiss();		 
			
		}
		
		
		public void TextBoxAlert() {
			driver.findElement(AlertWithTextBox).click();
			driver.findElement(EnterTextBox).click();
			
			Alert alert = driver.switchTo().alert();
			// Dismiss the alert
			alert.sendKeys("sai");
			alert.accept();
		}
			

}
