package exp13;

abstract class Faculty implements Runnable {
	abstract public void performMeeting();
	
	public void run() {
		performMeeting();
	}
}

class Enggineering extends Faculty {
	public void performMeeting() {
		int n = (int)(Math.random() * 100000000) % 100000;
		String s = new String();
		while (n > 0) {
			s += (char)(n%10 + 'a');
			n /= 10;
		}

		System.out.println("Engineering faculty has proposed '" + s + "' as new departname.");
	}
}

class Science extends Faculty {
	public void performMeeting() {
		int n = (int)(Math.random() * 100000000) % 100000;
		String s = new String();
		while (n > 0) {
			s += (char)(n%10 + 'a');
			n /= 10;
		}

		System.out.println("Science faculty has proposed '" + s + "' as new departname.");
	}
}

class Arts extends Faculty {
	public void performMeeting() {
		int n = (int)(Math.random() * 100000000) % 100000;
		String s = new String();
		while (n > 0) {
			s += (char)(n%10 + 'a');
			n /= 10;
		}

		System.out.println("Arts faculty has proposed '" + s + "' as new departname.");
	}
}

class Law extends Faculty {
	public void performMeeting() {
		int n = (int)(Math.random() * 100000000) % 100000;
		String s = new String();
		while (n > 0) {
			s += (char)(n%10 + 'a');
			n /= 10;
		}

		System.out.println("Law faculty has proposed '" + s + "' as new departname.");
	}
}

class SocialScience extends Faculty {
	public void performMeeting() {
		int n = (int)(Math.random() * 100000000) % 100000;
		String s = new String();
		while (n > 0) {
			s += (char)(n%10 + 'a');
			n /= 10;
		}

		System.out.println("Social Science faculty has proposed '" + s + "' as new departname.");
	}
}

class BusinessAdministration extends Faculty {
	public void performMeeting() {
		int n = (int)(Math.random() * 100000000) % 100000;
		String s = new String();
		while (n > 0) {
			s += (char)(n%10 + 'a');
			n /= 10;
		}

		System.out.println("Business Administration faculty has proposed '" + s + "' as new departname.");
	}
}

class LifeScience extends Faculty {
	public void performMeeting() {
		int n = (int)(Math.random() * 100000000) % 100000;
		String s = new String();
		while (n > 0) {
			s += (char)(n%10 + 'a');
			n /= 10;
		}

		System.out.println("Life Sciencde faculty has proposed '" + s + "' as new departname.");
	}
}
public class VcOffice {
	Faculty faculties[] = new Faculty[] {
			new Enggineering(),
			new Science(),
			new Arts(),
			new Law(),
			new SocialScience(),
			new BusinessAdministration(),
			new LifeScience()
	};
	
	public void askForNewDeptNames() throws InterruptedException {
		Thread t;
		for (int i = 0; i < 7; ++i) {
			t = new Thread(faculties[i]);
			t.start();
			t.join();
		}
		finalizeAllNewDepts();
	}
	
	public void finalizeAllNewDepts() {
		System.out.println("All new department proposals have been finalized.");
	}
}
