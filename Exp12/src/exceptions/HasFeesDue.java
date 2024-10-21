package exceptions;

import java.lang.Exception;

public class HasFeesDue extends Exception {
	public String toString() {
		return "student has due fees";
	}
}
