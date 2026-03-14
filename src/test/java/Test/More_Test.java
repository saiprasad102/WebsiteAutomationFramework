package Test;

import BaseClass.Basic_BrowserSetup;
import More.DynamicData;



import org.testng.annotations.Test;



	public class More_Test extends Basic_BrowserSetup {

	    @Test
	    public void testGetAllDynamicUsers() {

	        DynamicData dynamicPage = new DynamicData(driver);
	       
	        dynamicPage.moreclick();
	        dynamicPage.GetDeatils();



	        // Click the button multiple times to generate users
	        

	       
	    }
	}
	


