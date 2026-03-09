package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accordion {
	WebDriver driver;
	
// Constructor
		public Accordion (WebDriver driver) {
			this.driver = driver;
		}		
	
//		Locators
		By widget = (By.xpath("//a[@href='Widgets.html']"));
		By accordion = (By.xpath("//a[@href='Accordion.html']"));
		By group1 = (By.xpath("//b[text()='Collapsible Group 1 - Readability']"));
		By group2 = (By.xpath("//b[text()='Collapsible Group 2 - Single Line Coding']"));
		
		
		public void ClickAccordion() {
			driver.findElement(widget).click();
			driver.findElement(accordion).click();
					
			
		}
		
		public void VerifyContent1() {
			driver.findElement(group1).click();	
//			WebElement content = driver.findElement(By.xpath("//div[contains(@class,'panel-body') and contains(text(),'This Automation Testing API is very simple to read and understand. Every method in this is self explanatory.')]"));
			WebElement content = driver.findElement(By.xpath("//div[contains(@class,'panel-body') and contains(text(),'This Automation Testing API is very simple ')]"));			
			
			if (content.isDisplayed()) {
				System.out.println("Text is displayed in Accordion! 1");
			}
			else {
				System.out.println("Text is NOT displayed.");
			}
		}
		
		public void VerifyContent2() {
			driver.findElement(group2).click();
			WebElement content2 = driver.findElement(By.xpath("//div[contains(@class,'panel-body') and contains(text(),'In this Automation tool, each and every functionality will be achieved by Single line code. i.e.')]"));
			
			if (content2.isDisplayed()) {
				System.out.println("Text is displayed in Accordion! 2");
			}
			else {
				System.out.println("Text is NOT displayed.");
			}
		}
	

}
