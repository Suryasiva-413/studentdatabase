package studentdatabaseapp;

import java.util.Scanner;

public class Studentdatabaseapp {

	public static void main(String[] args) {

		System.out.println("Enter the number of students to enroll:");
		Scanner in = new Scanner(System.in);
		int numofstu = in.nextInt();
		Student [] students = new Student[numofstu];
		for (int n=0; n<numofstu; n++) {
			students[n]= new Student();
			students[n].enroll();
			students[n].paytution();
		}
		for ( int n=0; n<numofstu; n++) {
			System.out.println(students[n].showInfo());
		}
		

	}

}
