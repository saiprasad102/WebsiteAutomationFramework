package Test;


import org.testng.annotations.Test;

import BaseClass.Basic_BrowserSetup;
import WYSIWYG.CKEditor;
import WYSIWYG.CodeMirror;
import WYSIWYG.SummerNote;
import WYSIWYG.TinyMCE;


public class WYSIWYG_Test extends Basic_BrowserSetup {
	
	
	@Test(groups = {"wys"}, priority = 1)
	public void runTinyMCES() {
		TinyMCE CheckTinyMCES = new TinyMCE(driver);
		CheckTinyMCES.CheckTinyMCE();	
	}
	
		
	
	@Test(enabled = false)
	public void runCKEditor() {
		CKEditor CheckCKEdit = new CKEditor(driver);
		CheckCKEdit.CheckCKEditor();		
	}
	
	
	@Test(groups = {"wys"}, priority = 2)
	public void runSummerNote() {
		SummerNote CheckSummer = new SummerNote(driver);
		CheckSummer.CheckSummerNote();
	}

	
	
	@Test(groups = {"wys"}, priority = 3)
	public void runCodeMirror() {		
		CodeMirror CheckCodeMirr = new CodeMirror(driver);
		CheckCodeMirr.CheckCodeMirror();
	}
	
	
	
	

//	public static void main(String[] args) {
//		
//		boolean runTinyMCES = false;
//		boolean runCKEditor = false;
//		boolean runSummerNote =false;
//		boolean runCodeMirror =false;
//// to open browser
//		WYSIWYG_Test test = new WYSIWYG_Test();
//		test.setup();
//		
//		
//		
//		
//	if (runTinyMCES) {
//		// creates an object to work with the TinyMCE editor using browser
//				TinyMCE CheckTinyMCES = new TinyMCE(test.driver);
//				CheckTinyMCES.CheckTinyMCE();
//	}
//		
//	if (runCKEditor) {
//		
//		CKEditor CheckCKEdit = new CKEditor(test.driver);
//		CheckCKEdit.CheckCKEditor();
//	}	
//	
//	if (runSummerNote) {
//		
//		SummerNote CheckSummer = new SummerNote(test.driver);
//		CheckSummer.CheckSummerNote();
//	}	
//	if (runCodeMirror) {
//		
//		CodeMirror CheckCodeMirr = new CodeMirror(test.driver);
//		CheckCodeMirr.CheckCodeMirror();
//	}	
//
//	}

}
