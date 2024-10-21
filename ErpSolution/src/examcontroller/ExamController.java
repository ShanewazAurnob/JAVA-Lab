
package examcontroller;

import accounts.Accounts;

interface Result {
	public void publishResult();
}

class Science implements Result {
	public void publishResult() {
		System.out.println("Publishing science faculty result...");
	}
}

class Engineering implements Result {
	public void publishResult() {
		System.out.println("Publishing Engineering faculty result...");
	}
}

class LifeScience implements Result {
	public void publishResult() {
		System.out.println("Publishing Life Science faculty result...");
	}
}

class SocialScience implements Result {
	public void publishResult() {
		System.out.println("Publishing Social Science faculty result...");
	}
}

class Arts implements Result {
	public void publishResult() {
		System.out.println("Publishing Arts faculty result...");
	}
}

class BusinessAdministration implements Result {
	public void publishResult() {
		System.out.println("Publishing Business Administration faculty result...");
	}
}

class Law implements Result {
	public void publishResult() {
		System.out.println("Publishing Law faculty result...");
	}
}

public class ExamController {
	private Accounts ac = new Accounts();
	
	public void processResults() {
		System.out.println("Result processing going on...");
		ac.haveStudentsPaidExamFees();
		System.out.println("Processing results of 7 faculties...");
		
		Result r = new Science();
		r.publishResult();
		
		r = new Engineering();
		r.publishResult();
		
		r = new LifeScience();
		r.publishResult();
		
		r = new SocialScience();
		r.publishResult();
		
		r = new Arts();
		r.publishResult();
		
		r = new BusinessAdministration();
		r.publishResult();
		
		r = new Law();
		r.publishResult();
	}
	
	public void publishAdmissionTestResult() {
		System.out.println("Publishing admission test result...");
	}
}
