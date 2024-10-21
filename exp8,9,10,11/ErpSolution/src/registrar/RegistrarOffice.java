package registrar;

interface Recruitment {
	public void recruit();
}

class Teacher implements Recruitment {
	public void recruit() {
		viva();
	}
	
	private void viva() {
		System.out.println("Taking viva for teacher recruitment...");
		System.out.println("Viva Completed...");
	}
}

class Officer implements Recruitment {
	public void recruit() {
		writtenExam();
		viva();
	}
	
	private void writtenExam() {
		System.out.println("Taking written exam for officer recruitment...");
		System.out.println("Written Exam completed...");
	}
	
	private void viva() {
		System.out.println("Taking viva for officer recruitment...");
		System.out.println("Viva Completed...");
	}
}


class Staff implements Recruitment {
	public void recruit() {
		writtenExam();
		practicalExam();
		viva();
	}
	
	private void writtenExam() {
		System.out.println("Taking written exam for staff recruitment...");
		System.out.println("Written Exam completed...");
	}
	
	private void viva() {
		System.out.println("Taking viva for staff recruitment...");
		System.out.println("Viva Completed...");
	}
	
	private void practicalExam() {
		System.out.println("Taking pratical exam for Staff recruitment...");
		System.out.println("Practical Exam Completed...");
	}
}

class Students {
	public void takeAdmissionTest() {
		System.out.println("Taking admission test for student enrollment...");
		System.out.println("Admission Test Completed...");
	}
}

public class RegistrarOffice {
	Recruitment r;
	
	public void recruitTeacher() {
		r = new Teacher();
		r.recruit();
	}
	
	public void recruitOfficer() {
		r = new Officer();
		r.recruit();
	}
	
	public void recruitStaff() {
		r = new Staff();
		r.recruit();
	}
	
	public void enrollStudents() {
		Students s = new Students();
		s.takeAdmissionTest();
	}
}
