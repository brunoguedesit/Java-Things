package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("First Grade: ");
		student.firstGrade = sc.nextDouble();
		
		System.out.print("Second Grade: ");
		student.secondGrade = sc.nextDouble();
		
		System.out.print("THird Grade: ");
		student.thirdGrade = sc.nextDouble();
		System.out.println();
		
		System.out.println("FINAL GRADE = " + student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS ", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
