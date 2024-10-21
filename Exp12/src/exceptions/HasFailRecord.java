package exceptions;

import java.lang.Exception;

public class HasFailRecord extends Exception {
	public String toString() {
		return "the student has previously failed in this exam";
	}
}
