package java_internship_assignment;

import java.util.Scanner;
public class sumuntilnegativenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
	while(true)
	{	
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num>=0)
		{	
			sum=sum+num;
		}
		else if(num<0)
		{	
			System.out.println("sum:"+sum);
			break;
		}

	}

}
}