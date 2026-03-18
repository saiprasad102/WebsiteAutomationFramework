package Test;

import BaseClass.Basic_BrowserSetup;
import More.DynamicData;
import More.FileDownload;

import org.testng.annotations.Test;



	public class More_Test extends Basic_BrowserSetup {

	  	    public void testGetAllDynamicUsers() {

	        DynamicData dynamicPage = new DynamicData(driver);
	       
	        dynamicPage.moreclick();
	        dynamicPage.GetDeatils();



	        // Click the button multiple times to generate users
	        

	       
	    }
	  	    
	  	    
	  	    
	  	    public void TestFileDownload() {
	  	    	FileDownload filedown = new FileDownload(driver);
	  	    	
	  	    	
	  	    	filedown.TextFileDownload();
	  	    	filedown.PdfFileDownload();
			}
	}
	


