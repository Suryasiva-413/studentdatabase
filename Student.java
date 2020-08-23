package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses=null;
	private String balance;
	private int costofcourse=600;
	private int tutionbalance=0;
	private static int id =1000;
	public Student () {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the students firstname:");
		this.firstname = in.nextLine();
		System.out.println("enter the students lastname");
		this.lastname = in.nextLine();
		System.out.println("1- freshman\n 2- sophomore \n 3- junior \n 4- senior\n enter student classlevel:");
		this.gradeyear = in.nextInt();
		studentID();
		System.out.println(firstname+ " "+lastname+" "+gradeyear + " "+ studentID);
		}
		private void studentID() {
			id++;
			this.studentID= gradeyear+""+id;}
		
		public void enroll() {
			do {
			
				System.out.println("Enter course to Enroll(Q to quit):");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if (!course.equals("Q")) {
					courses = courses + "\n" + course;
					tutionbalance = tutionbalance + costofcourse;
				}
				else {
					System.out.println("Break!");
					break;
				}
				}while(1!=0);
			//System.out.println("Enrolled in :"+ courses);
			//System.out.println("Tutionbalance:"+ tutionbalance);
			
	
		}

public String showInfo()
{
	return ( "\nName:"+ firstname+" "+ lastname+"\n coursesenrolled:"+courses+"\nbalance:"+tutionbalance);
}
public void viewBalance() {
	System.out.println("your balance is $:"+ tutionbalance);	
}
public void paytution() {
	
	System.out.println("Enter your payment in $:");
	Scanner in = new Scanner(System.in);
	int payment = in.nextInt();
	tutionbalance = tutionbalance-payment;
	System.out.println("Thanks for the payment of:"+ payment);
	viewBalance();
}
	
}
		
        
	



				
			
		
		
			
		

		
				
			
		
	
	


