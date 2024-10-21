package registraroffice;

import java.lang.Math;

import accounts.AccountsOffice;
import exceptions.HasFailRecord;
import exceptions.HasFeesDue;
import exceptions.PaidLess;
import form.Form;

public class RegistrarOffice {
	AccountsOffice acOffice = new AccountsOffice();
	
	public void submitForm(Form f) throws HasFailRecord, HasFeesDue, PaidLess {
		int ID = Math.abs(f.getID().hashCode());
		if (checkIfFailed(ID)) {
			throw new HasFailRecord();
		}
		
		acOffice.calcuateFees(f);
	}
	
	private boolean checkIfFailed(int ID) {
		// Generating random number between 0 and 1
		int r = ((int)(Math.random() * (double)ID) + 5) % 2;
		return (r == 1 ? false : true);
	}
}
