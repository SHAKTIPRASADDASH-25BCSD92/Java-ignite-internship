package java_internship_assignment;
import java.util.Scanner;

public class travel_expense {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter travel distance in km:");
	double dis=sc.nextDouble();
	System.out.println("Petrol price per litre:");
	double price=sc.nextDouble();
	System.out.println("Vehicle mileage:");
	double milg=sc.nextDouble();
	System.out.println("****TRAVEL_COST*****");
	System.out.println("TOTAL DISTANCE:"+dis);
	System.out.println("PETROL PRICE:"+price);
	System.out.println("MILEAGE:"+milg);
	System.out.println("TOTAL PETROL:"+(dis/milg));
	System.out.println("TRAVEL COST TOTAL:"+((dis/milg)*price));
	
	
	
	

	}

}
