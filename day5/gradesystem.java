package java_internship_assignment;

import java.util.Scanner;

public class gradesystem {	
	public static char gradesystem(int marks)
	{
		if(marks>=90)
		{	
			if(marks>100)
			{	
				System.out.println("Wrong input");
				return 0;
			}
			return 'A';
		}

		else if(marks>=80)
		{	
			return 'B';
		}
		else if(marks>=70)
		{	
			return 'C';
		}
		if(marks<35)
		{	
			return 'F';
		}
		else
		{	
			return 'P';
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		char grade=gradesystem(marks);
		System.out.println("Grade:"+(grade));
		
		

	}

}
