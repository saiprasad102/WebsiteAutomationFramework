package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datepicker {
	 WebDriver driver;
	 
// Constructor
	public Datepicker (WebDriver driver) {
		this.driver = driver;
	}	
	 

//Locators	
	By widget = (By.xpath("//a[@href='Widgets.html']"));
	By datewidget = (By.xpath("//a[@href='Datepicker.html']"));
	By DateDisabled = (By.xpath("//input[@id='datepicker1']")); 
	By selectDateForDisabled = (By.xpath("//td[@data-handler='selectDay']/a[text()='9']"));
	By DateEnabled = (By.xpath("//input[@id='datepicker2']"));
	By selectDateForEnabled = (By.xpath("//a[@title = 'Select Tuesday, Mar 3, 2026']"));
	//a[@class = 'ui-state-default ui-state-highlight ui-state-active']
	
	
	public void SelectDateDisabledAndEnabled() {
		driver.findElement(widget).click();
		driver.findElement(datewidget).click();
		
		driver.findElement(DateDisabled).click();
		WebElement Disdate = driver.findElement(selectDateForDisabled);
		Disdate.click();
		String PrintDisdate = Disdate.getText();
		System.out.println("Disabled Date Selected: " + PrintDisdate);
		
		
		driver.findElement(DateEnabled).click();
		WebElement Endate = driver.findElement(selectDateForEnabled);		
		Endate.click();
		String PrintEndate = Endate.getText();
		System.out.println("Enabled Date Selected: " + PrintEndate);
		
	}
	 
	 
	 
}
