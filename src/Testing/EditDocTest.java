package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Document;
import View.Text2SpeechEditorAppView;

public class EditDocTest {
	Document mydoc;
	@Test
	public void test() {
		Text2SpeechEditorAppView editor = new Text2SpeechEditorAppView();
		editor.openFile();
		editor.editFile();
		mydoc = new Document();
		assertEquals(mydoc.getContents(),editor.getDocContents());
		System.out.println(mydoc.getContents());
		System.out.println(editor.getDocContents());
	}

}
