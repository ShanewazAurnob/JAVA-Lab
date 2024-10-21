package exp14;

import java.io.IOException;

public class WordCounter implements Runnable {
	private static CountWords countWords;
	private int paragraphToBeRead;
	private String tName;
	
	public WordCounter(String name, int n) {
		paragraphToBeRead = n;
		tName = name;
	}
	
	static {
		try {
			countWords = new CountWords("C:\\Users\\Dell\\eclipse-workspace\\Exp14\\src\\paragraph.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		int n = ((countWords.getParagraphSize() * paragraphToBeRead) / 100); 
		int wCount = 0;
		for (int i = 0; i < n; ++i) {
			try {
				String s = countWords.readNextWord();
				if (s.isEmpty())
					break;
				i += s.length();
				++wCount;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("'" + tName + "' thread counted: " + wCount + " words.");
	}
}
