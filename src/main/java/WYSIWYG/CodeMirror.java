package WYSIWYG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CodeMirror {
	WebDriver driver;
	// Constructor
		public CodeMirror (WebDriver driver) {
			this.driver = driver;
		}
		
	//Locators	
		By WYSIWYG = (By.xpath("//a[contains(text(),'WYSIWYG')]"));
		By selectCodeMirror = (By.xpath("//a[contains(text(),'CodeMirror')]"));
		By clickonCodeMirror = (By.xpath("//pre[@class=' CodeMirror-line ']"));
		
		
		public void CheckCodeMirror() {
			driver.findElement(WYSIWYG).click();
			driver.findElement(selectCodeMirror).click();
			driver.findElement(clickonCodeMirror).click();
//			driver.findElement(clickonCodeMirror).sendKeys("saiprasad");
			Actions actions = new Actions(driver);
			actions.sendKeys("Testing CodeMirror with Selenium")
		       .sendKeys(Keys.ENTER)
		       .sendKeys("Second line of text")
		       .perform();
			
			
		}
		
		
		
		
		
}
