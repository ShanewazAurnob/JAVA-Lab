package student;

import cseoffice.CseOffice;
import form.Form;

public class Student {
	private String ID;
	Form f;
	CseOffice cseOffice = new CseOffice();
	
	public Student(String id) {
		ID = id;
	}
	
	public void collectForm() {
		f = cseOffice.getForm();
		f.setID(ID);
	}
	
	public void submitForm() {
		try {
			cseOffice.submitForm(f);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
