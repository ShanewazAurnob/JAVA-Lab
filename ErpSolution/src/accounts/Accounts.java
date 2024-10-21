package accounts;

public class Accounts {
	private void areStudentsValid() {
		System.out.println("Checking students validity...");
		System.out.println("#A Students are valid and #B students are invalid.");
	}
	
	public void haveStudentsPaidExamFees() {
		areStudentsValid();
		System.out.println("Checking for exam payments...");
		System.out.println("#A Students have paid exam fees and #B students have not paid exam fees.");
	}
}
