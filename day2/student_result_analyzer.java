package java_internship_assignment;

import java.util.Scanner;

public class student_result_analyzer {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter student name");
		String name=sc.nextLine();
		System.out.println("Enter marks in 3 subjects:");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		System.out.println("STUDENT NAME:"+name);
		System.out.println("MARKS IN 3 SUBJECTS :"+sub1 +sub2 +sub3);
		System.out.println("Total marks="+(sub1+sub2+sub3));
		double avg=(sub1+sub2+sub3)/3;
		System.out.println("Average marks:"+avg);
		System.out.println("Avg status:"+(avg>50));
		
		

}
}
