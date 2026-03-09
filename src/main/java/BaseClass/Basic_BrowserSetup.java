package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class Basic_BrowserSetup {
		public WebDriver driver;

		@BeforeMethod
		public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Register.html");
	        driver.manage().window().maximize();

	}

}
