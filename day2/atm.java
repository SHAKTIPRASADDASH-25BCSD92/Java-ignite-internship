package java_internship_assignment;
import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account holders name:");
		String name=sc.nextLine();
		System.out.println("Enter the Account number");
		int acctnum=sc.nextInt();
		System.out.println("Enter your Account balance");
		double balance=sc.nextDouble();
		System.out.println("Enter the withdrawl amount");
		double withamnt=sc.nextDouble();
		double rembalance=(balance-withamnt);
		if(balance>withamnt)
		{	System.out.println(" you are eligible as withdrawl amount<account balance ");
			System.out.println("ACCOUNT HOLDERS NAME:"+name);
			System.out.println("ACCOUNT NUMBER:"+acctnum);
			System.out.println("ACCOUNT BALANCE:"+balance);
			System.out.println("WITHDRWAL AMOUNT:"+withamnt);
			System.out.println("REMAINING BALANCE:"+rembalance);
			System.out.println("THANK YOU FOR USING SBI");
			
		}	
		else
			System.out.println(" you are not eligible as withdrawl amount>account balance ");
		
		

	}

}
