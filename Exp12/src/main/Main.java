package main;

import java.util.Scanner;
import student.Student;

public class Main {

	public static void main(String[] args) {
		System.out.println("What's your ID? ");
		Scanner sc = new Scanner(System.in);
		String ID = sc.next();
		
		Student s = new Student(ID);
		s.collectForm();
		s.submitForm();
		sc.close();
	}
}
