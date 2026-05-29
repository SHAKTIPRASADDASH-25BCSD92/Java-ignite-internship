package java_internship_assignment;

import java.util.Scanner;

public class employeebonus {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your experience");
			int exp=sc.nextInt();
			System.out.println("Enter your attendance");
			int attendance=sc.nextInt();
			System.out.println("Enter your rating");
			int rating=sc.nextInt();
			if(attendance<60)
				System.out.println("Not eligible for Bonus");
			else if(exp>3&&attendance>85)
				{	
					System.out.println("Eligible for Bonus");
					switch(rating)
					{	
					case 5:System.out.println("BONUS:Rs50,000");break;
					
					case 4:System.out.println("BONUS:Rs40,000");break;
					
					case 3:System.out.println("BONUS:Rs30000");break;
					
					default:System.out.println("Not eligible for Bonus");
					
					
					}
				}
			else
					System.out.println("Not eligible for bonus");
				
			


	}

}
