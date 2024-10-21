package exp14;

import java.io.FileInputStream;
import java.io.IOException;

public class CountWords {
	private String text;
	int textIndex = 0;
	
	public CountWords(String fname) throws IOException {
		FileInputStream is = new FileInputStream(fname);
		byte[] b = is.readAllBytes();
		text = new String(b);
		is.close();
	}

	public int getParagraphSize() {
		return text.length();
	}
	
	public synchronized String readNextWord() throws IOException {
		if (textIndex >= text.length())
			return new String("");
		
		while (textIndex < text.length() && 
				Character.isWhitespace(text.charAt(textIndex))) {
			++textIndex;
		}
		
		if (textIndex >= text.length())
			return new String("");
		
		int startIndex = textIndex;
		while (textIndex < text.length() && 
				!Character.isWhitespace(text.charAt(textIndex)))
			++textIndex;
		
		return text.substring(startIndex, textIndex);
	}
}
