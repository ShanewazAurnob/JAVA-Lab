package exp14;

public class Main {

	public static void main(String[] args) {
		new Thread(new WordCounter("Thread1", 33)).start();
		new Thread(new WordCounter("Thread2", 33)).start();
		new Thread(new WordCounter("Thread3", 34)).start();
	}
}
