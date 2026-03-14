package WYSIWYG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SummerNote {

	WebDriver driver;
	// Constructor
		public SummerNote (WebDriver driver) {
			this.driver = driver;
		}

		//Locators	
		By WYSIWYG = (By.xpath("//a[contains(text(),'WYSIWYG')]"));
		By selectSummerNote = (By.xpath("//a[contains(text(),'SummerNote')]"));	
		By clickonsummertext = (By.cssSelector("div.note-editable"));
		By fontcolour = (By.cssSelector("i.note-icon-font.note-recent-color"));
		By selectcolur = (By.xpath("//button[@data-original-title='More Color']"));
		By Bgcolur = (By.xpath("//button[@data-value='inherit']"));
		By selectBgcolur = (By.xpath("//button[@data-value='#9CC6EF']"));
		By forecolur = (By.xpath("//button[@data-value='foreColor']"));
		By selectforecolur = (By.xpath("//button[@data-original-title='#FFEFC6']"));
		
		
		public void CheckSummerNote() {
			driver.findElement(WYSIWYG).click();
			driver.findElement(selectSummerNote).click();
			
			driver.findElement(clickonsummertext).click();
			driver.findElement(clickonsummertext).sendKeys(Keys.COMMAND, "a");
//			WebElement clickonsummertext = driver.findElement(By.cssSelector("div.note-editable"));
//			clickonsummertext.click();
//			clickonsummertext.sendKeys(Keys.chord(Keys.COMMAND, "a"));
			driver.findElement(fontcolour).click();
			driver.findElement(selectcolur).click();
			driver.findElement(Bgcolur).isSelected();
			driver.findElement(selectBgcolur).click();
			driver.findElement(fontcolour).click();
			driver.findElement(selectcolur).click();
			driver.findElement(forecolur).isSelected();
			driver.findElement(selectforecolur).click();
			driver.findElement(clickonsummertext).click();
			
		}

}