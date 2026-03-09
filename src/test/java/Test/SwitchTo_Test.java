package Test;
import BaseClass.Basic_BrowserSetup;
import PageClass.SwitchTo.Alerts;
import PageClass.SwitchTo.Frames;
import PageClass.SwitchTo.WindowsHandling;

public class SwitchTo_Test extends Basic_BrowserSetup {

	public static void main(String[] args) {
		
		boolean runAlerts = false;
        boolean runFrames = false;
        boolean runwindows = true;
		
		SwitchTo_Test test = new SwitchTo_Test();
		test.setup();
		
		if (runFrames) {
			// 1. Frames Data		
			Frames Framesswitch = new Frames(test.driver);
			
			Framesswitch.enterSwitchTo(null);
			Framesswitch.enterFrames(null);
			
			Framesswitch.enterNestedFrames(null);
			Framesswitch.enterParentFrame(null);
			Framesswitch.enterChildFrame(null);
			Framesswitch.enterIframeDemoTextBox("Nested iFrame Demo");
//			Framesswitch.enterSingleFrame("Hello Frame!");
			
		}
		
		if (runAlerts) {
			// 2. Alert Data	
			
			Alerts Alertswitch = new Alerts(test.driver);
			
			Alertswitch.enterSwitchTo(null);
			Alertswitch.enterAlerts();
			Alertswitch.clickClickAlertButton(null);
			Alertswitch.SwitchToAlert();
			Alertswitch.AlertWithOkCancel();
			Alertswitch.TextBoxAlert();
			
			
		}
		
		if (runwindows) {
			
			WindowsHandling windowhandel = new WindowsHandling(test.driver);
			
			
			windowhandel.enterSwitchto();
			windowhandel.enterWindowsHandling();
		// 1. Open New Tab Window.		
//			windowhandel.NewTabOpen();
			
		// 2. Open New Seperate Window.	
//			windowhandel.ShowSeperateWindow();

			
		//  3. Open Multiple window.
			windowhandel.MultipleWindows();
		}
		
		

		
		
		
		
		

	}

}
