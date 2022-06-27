package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Document;
import View.Text2SpeechEditorAppView;

public class OpenDocTest {
	Document mydoc;
	@Test
	public void test() {
		//fail("Not yet implemented");
		Text2SpeechEditorAppView editor = new Text2SpeechEditorAppView();
		editor.openFile();
		mydoc = new Document();
		assertEquals(mydoc.getContents(),editor.getDocContents());
		System.out.println(mydoc.getContents());
		System.out.println(editor.getDocContents());
		
	}

}
