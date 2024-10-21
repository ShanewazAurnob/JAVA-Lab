package bank;

import form.Form;
import java.util.Scanner;

import examcontroller.ExamController;
import exceptions.PaidLess;

public class Bank {
	ExamController eController = new ExamController();
	
	public void takeFees(Form f) throws PaidLess {
		int fees = f.getFees();
		System.out.println("Pay " + fees + "tk: ");
		Scanner sc = new Scanner(System.in);
		int paidFees = sc.nextInt();
		
		if (paidFees < fees) {
			throw new PaidLess();
		}
		
		eController.generateAdmitCard(f);
	}
}
