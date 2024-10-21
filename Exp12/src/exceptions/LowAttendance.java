package exceptions;

import java.lang.Exception;

public class LowAttendance extends Exception {
	public String toString() {
		return "attendance less than 70%";
	}
}
