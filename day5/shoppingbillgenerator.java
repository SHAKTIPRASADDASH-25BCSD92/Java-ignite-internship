package java_internship_assignment;
import java.util.Scanner;


public class shoppingbillgenerator {	
	
	public static double bill(double org,int discount)
	{
		double bill;
		double discountamount;
		discountamount=(discount*org)/100;
		bill=(org-discountamount);
		
		return bill;
		
	}

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the bill amount");
		double org=sc.nextDouble();
		System.out.println("Enter the discount percentage");
		int discount=sc.nextInt();
		double bill=bill(org,discount);
		System.out.printf("Total Bill:%f",bill);
		
		
	}

}
