package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Document;
import Model.TTSFacade;
import View.Text2SpeechEditorAppView;

public class ReplayTest {

	@Test
	public void test() {
		Text2SpeechEditorAppView editor = new Text2SpeechEditorAppView();
		TTSFacade tf= new TTSFacade();

		Document mydoc = new Document();
		editor.openFile();
		editor.play();
		tf.play("The next audio must be the same");
		editor.replayAudio();
		
	}
}
