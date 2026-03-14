package Test;

import org.testng.annotations.Test;

import BaseClass.Basic_BrowserSetup;
import Interactions.DragAndDrop;
import Interactions.Resizable;
import Interactions.Selectable;

public class Interactions_Test extends Basic_BrowserSetup{
	@Test
	public void runSelectable() {
		Selectable selectinter = new Selectable(driver);
		selectinter.ClickInteraction();
		selectinter.ClickSelectable();
		selectinter.ClickDefaultFunc();
		selectinter.ClickSelectReadability();
		selectinter.ClickSerialize();
		selectinter.ClickSerialSelectRead();
		selectinter.CheckLableAndValue();
	}
	
	@Test
	public void runDragAndDrop() {
		DragAndDrop dragdrop = new DragAndDrop(driver);
		dragdrop.ClickInteraction();
		dragdrop.ClickDragAndDrop();
		 //1. to select static----
		dragdrop.ClickStatic();
		dragdrop.StaticDragAndDrop();
	}
	
	@Test
	public void runResizable() {
		Resizable resize = new Resizable(driver);
		resize.ClickResizable();
	}
	
	
	
	
//	public static void main(String[] args) {
		
		
		
		
		
//		boolean runSelectable = false;
//        boolean runDragAndDrop = false;
//        boolean runResizable = true;
////        boolean runwindows = true;
//		
//		Interactions_Test test = new Interactions_Test();
//		test.setup();
//		
//		if (runSelectable) {
//			Selectable selectinter = new Selectable(test.driver);
//			selectinter.ClickInteraction();
//			selectinter.ClickSelectable();
//			selectinter.ClickDefaultFunc();
//			selectinter.ClickSelectReadability();
//			selectinter.ClickSerialize();
//			selectinter.ClickSerialSelectRead();
//			selectinter.CheckLableAndValue();
//		}
//		
//		if (runDragAndDrop) {
//			DragAndDrop dragdrop = new DragAndDrop(test.driver);
//			dragdrop.ClickInteraction();
//			dragdrop.ClickDragAndDrop();
//			 //1. to select static----
//			dragdrop.ClickStatic();
//			dragdrop.StaticDragAndDrop();
//						
//		}
//		
//		if (runResizable) {
//			Resizable resize = new Resizable(test.driver);
//			resize.ClickResizable();
//		}
		
		

//	}

}
