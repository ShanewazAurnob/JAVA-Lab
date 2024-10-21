import examcontroller.ExamController;
import registrar.RegistrarOffice;

public class Main {

	public static void main(String[] args) {
		RegistrarOffice rof = new RegistrarOffice();
		rof.recruitTeacher();
		rof.recruitOfficer();
		rof.recruitStaff();
		rof.enrollStudents();
		
		ExamController ecnt = new ExamController();
		ecnt.publishAdmissionTestResult();
		ecnt.processResults();
	}
}
