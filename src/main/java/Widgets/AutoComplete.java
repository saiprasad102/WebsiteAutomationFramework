package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {
	WebDriver driver;

// Constructor
	public AutoComplete (WebDriver driver) {
		this.driver = driver;
	}	
	
//	Locators	
	By widget = (By.xpath("//a[@href='Widgets.html']"));
	By autocomplete = (By.xpath("//a[@href='AutoComplete.html']"));
	By Searchbox = (By.xpath("//input[@id = 'searchbox']"));
	By autosuggestion = (By.xpath("//ul[@id = 'ui-id-1']"));
	By selectautocomplete = (By.xpath("//a[@id = 'ui-id-164']"));
	By selectedCountry = By.xpath("//div[@class='ui-autocomplete-multiselect-item']");

	
	public void CheckAutoComplete() {
		driver.findElement(widget).click();
		driver.findElement(autocomplete).click();
		driver.findElement(Searchbox).click();
		driver.findElement(Searchbox).sendKeys("IND");
		driver.findElement(autosuggestion).isDisplayed();
		
		
	//	select the suggest country using keyboards
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		
		
		// Get the text of the selected suggestion from the input field
		WebElement country = driver.findElement(selectedCountry);
		String countryName = country.getText();
		System.out.println("Selected Country: " + countryName);

		
		
	}
	
	
	
}
