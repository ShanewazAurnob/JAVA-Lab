package exceptions;

import java.lang.Exception;
public class PaidLess extends Exception {
	public String toString() {
		return "student paid less than what was asked";
	}
}
