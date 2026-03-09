package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	WebDriver driver;
	
// Constructor
	public Slider (WebDriver driver) {
		this.driver = driver;
	}	
	

//Locators		
	By widget = (By.xpath("//a[@href='Widgets.html']"));
	By slider = (By.xpath("//a[@href='Slider.html']"));
	By sliderhandle = (By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
	
	public void DragTheSlider() {
		
		driver.findElement(widget).click();
		driver.findElement(slider).click();
		
		WebElement slide = driver.findElement(sliderhandle);
		slide.click();
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slide, 100, 0).perform();
		actions.dragAndDropBy(slide, 100, 0).perform();
		
		
	}
	
	
	
	
	
}
