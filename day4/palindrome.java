package java_internship_assignment;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int num1=num;
		int rem,rev=0;
		
		while(num!=0)
		{	
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		
		if(rev==num1)
		{	
			System.out.println("Palindrome number");
		}
		else
		{	
			System.out.println("Not Palindrome number");
		}
		
	}

}
