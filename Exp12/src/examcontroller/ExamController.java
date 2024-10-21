package examcontroller;

import form.Form;

public class ExamController {
	public void generateAdmitCard(Form f) {
		System.out.println("Admit card has been generated for ID: " + f.getID());
		System.out.println("Admit card has been sent to CSE office.");
	}
}
