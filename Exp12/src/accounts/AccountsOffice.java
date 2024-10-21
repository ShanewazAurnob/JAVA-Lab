package accounts;

import bank.Bank;
import exceptions.HasFeesDue;
import exceptions.PaidLess;
import form.Form;

public class AccountsOffice {
	Bank bank = new Bank();
	
	public void calcuateFees(Form f) throws HasFeesDue, PaidLess {
		if (hasDue(Math.abs(f.hashCode()))) {
			throw new HasFeesDue();
		}
		
		f.setFees(fees());
		bank.takeFees(f);
	}
	
	private int fees() {
		return 1560; // hard coded fees
	}
	
	private boolean hasDue(int ID) {
		// Generating random number between 0 and 1
		int r = ((int)(Math.random() * (double)ID)+5) % 2;
		return (r == 1 ? false : true);
	}
}
