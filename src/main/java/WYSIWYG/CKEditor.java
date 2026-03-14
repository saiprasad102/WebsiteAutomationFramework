package WYSIWYG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CKEditor {
	
	WebDriver driver;
	// Constructor
		public CKEditor (WebDriver driver) {
			this.driver = driver;
		}
		
	//Locators	
		By WYSIWYG = (By.xpath("//a[contains(text(),'WYSIWYG')]"));
		By selectCKEditor = (By.xpath("//a[contains(text(),'CKEditor')]"));
//		By ckeditorFrame = By.cssSelector("iframe.cke_wysiwyg_frame");
//		By editorBody = By.xpath("//body[@contenteditable='true']");

		
		public void CheckCKEditor() {
			driver.findElement(WYSIWYG).click();
			driver.findElement(selectCKEditor).click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement frame = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(
			                By.cssSelector("iframe.cke_wysiwyg_frame")));

			// switch to editor iframe
			driver.switchTo().frame(frame);

			// type text
			WebElement typetext = driver.findElement(By.tagName("body"));
			typetext.sendKeys("Testing CKEditor");

			// select text
			typetext.sendKeys(Keys.chord(Keys.COMMAND, "a"));

			// go back to toolbar
			driver.switchTo().defaultContent();

			// click Bold
//			driver.findElement(By.xpath("//a[@title='Bold']")).click();
			
			// wait for Bold button
			WebElement bold = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath("//a[@title='Bold']")));

			bold.click();
			
		}
		
		
}
