package java_internship_assignment;

import java.util.Scanner;
class Parkingfee
{	
	int hours,fee;
	String num,type;
	Parkingfee(String n,int h,String t)
	{	
		num=n;
		hours=h;
		type=t;
		if(t.equals("Bike"))
		{	
			fee=(10*h);
		}
		else if(t.equals("Car"))
		{	
			fee=(30*h);
		}
		else 
		{	
			fee=(50*h);
		}
	}
	void display()
	{	
		System.out.println("Vehicle No:"+(num));
		System.out.println("Vehicle Type:"+(type));
		System.out.println("Parking Fee:"+(fee));
	}
	
}
public class smartparkingsystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle-number:");
		String num=sc.nextLine();
		System.out.println("Enter Total hours:");
		int hours=sc.nextInt();
		System.out.println("Enter vehicle type:");
		String type=sc.next();
		
		Parkingfee v1=new Parkingfee(num,hours,type);
		
		v1.display();
	}

}
