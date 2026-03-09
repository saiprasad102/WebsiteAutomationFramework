package Test;

import BaseClass.Basic_BrowserSetup;
import Widgets.Accordion;
import Widgets.AutoComplete;
import Widgets.Datepicker;
import Widgets.Slider;

public class Widgets_Test extends Basic_BrowserSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean runAccordion = false;
        boolean runAutoComplete = false;
        boolean runDatepicker = false;
        boolean runSlider = true;
        
		Widgets_Test test = new Widgets_Test();
		test.setup();
		
		if (runAccordion) {
			Accordion ContainsAccordion = new Accordion(test.driver);
			ContainsAccordion.ClickAccordion();
			ContainsAccordion.VerifyContent1();  // Text is NOT displayed.
			ContainsAccordion.VerifyContent2();
		}
		
		if (runAutoComplete) {
			 AutoComplete  ContainsAutoComplete = new AutoComplete(test.driver);
			 ContainsAutoComplete.CheckAutoComplete();
		}
		
		if (runDatepicker) {
			Datepicker SelectDatapicker = new Datepicker(test.driver);
			SelectDatapicker.SelectDateDisabledAndEnabled();
		}
		
		if (runSlider) {
			Slider MoveSlider = new Slider(test.driver);
			MoveSlider.DragTheSlider();
		}
		
		
	}

}
