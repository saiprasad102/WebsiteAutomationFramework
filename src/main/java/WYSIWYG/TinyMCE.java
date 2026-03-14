package WYSIWYG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TinyMCE {
	
	WebDriver driver;
	// Constructor
		public TinyMCE (WebDriver driver) {
			this.driver = driver;
		}	
	//Locators	
		By WYSIWYG = (By.xpath("//a[contains(text(),'WYSIWYG')]"));
		By selectTinyMCE = (By.xpath("//a[contains(text(),'TinyMCE')]"));
		By ClickTinyMCE = (By.xpath("//img[contains(@src,'cdn-shutdown.png')]"));
		
		
		
		
		public void CheckTinyMCE() {
			driver.findElement(WYSIWYG).click();
			driver.findElement(selectTinyMCE).click();
			driver.findElement(ClickTinyMCE).click();
			
			String mainWindowString = driver.getWindowHandle(); // current window
			Set<String> allWindowsStrings = driver.getWindowHandles(); // all windows
			System.out.println(allWindowsStrings);
			driver.switchTo().window(mainWindowString);
		}
		

}
