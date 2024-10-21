package cseoffice;

import form.Form;
import registraroffice.RegistrarOffice;

import java.lang.Math;

import exceptions.HasFailRecord;
import exceptions.HasFeesDue;
import exceptions.LowAttendance;
import exceptions.PaidLess;

public class CseOffice {
	private RegistrarOffice regOffice = new RegistrarOffice();
	
	public Form getForm() {
		return new Form();
	}
	
	public void submitForm(Form f) throws LowAttendance, HasFailRecord, HasFeesDue, PaidLess {
		// Using ID's hash code to generate random attendance
		int ID = Math.abs(f.getID().hashCode());
		int attendance = getAttendance(ID);
		if (attendance < 70) {
			throw new LowAttendance();
		}
		
		regOffice.submitForm(f);
		System.out.println("Admit card for ID: " + f.getID() + " has been collected.");
	}
	
	public int getAttendance(int ID) {
		// generating a random attendance between 60 to 100
		return (int)(Math.random() * ID) % 100 + 60; 
	}
}
