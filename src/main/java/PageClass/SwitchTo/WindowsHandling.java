package PageClass.SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsHandling {
	
	WebDriver driver;
	
	// Constructor
	public WindowsHandling (WebDriver driver) {
		this.driver = driver;
		}
	
	
// Locators 
	By Switchto = (By.xpath("//a[text()='SwitchTo']"));
	By Windows = (By.xpath("//a[contains(text(),'Windows')]"));
	
//  // 1. Open New Tab Window
//	By NewTabbedWindows   = (By.xpath("//button[contains(text(),'    click   ')]"));
	
//// 2. Open New Seperate Windows
//	By NewSeperateWindow = (By.xpath("//a[contains(text(),'Open New Seperate Windows')]"));
//	By ClickNewSeperateWindow  = (By.xpath("//button[@class = 'btn btn-primary']"));

	
//  3. Open Multiple windows	
	By SeperateMultipleWindow = (By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]"));
	By ClickSeperateMultipleWindow = (By.xpath("//button[@onclick = 'multiwindow()']"));
	
	
	
	
// Method
	
	public void enterSwitchto() {
		driver.findElement(Switchto).click();
	}
	
	public void enterWindowsHandling() {
		driver.findElement(Windows).click();
	}
// 1. Open New Tab Window	
//	public void NewTabOpen() {
//		driver.findElement(NewTabbedWindows).click();
//	}
	
	
	
//  2. Open New Seperate Windows
//	public void ShowSeperateWindow() {
//		driver.findElement(NewSeperateWindow).click();
//		driver.findElement(ClickNewSeperateWindow).click();
//		
//	}

	
		
//  3. Open Multiple windows	
	public void MultipleWindows() {
		driver.findElement(SeperateMultipleWindow).click();
		driver.findElement(ClickSeperateMultipleWindow).click();
		Set<String> allld = driver.getWindowHandles();
        System.out.println(allld);
	}



}
