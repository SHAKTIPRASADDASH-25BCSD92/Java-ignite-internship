package java_internship_assignment;

import java.util.Scanner;

public class travelcostcalculator {	
	public static double travelcost(double dis,double milg,double price)
	{
		double cost;
		double petrol;
		
		petrol=dis/milg;
		cost=petrol*price;
		return cost;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the distance ");
		double dis=sc.nextDouble();
		System.out.println("Enter the mileage");
		double milg=sc.nextDouble();
		System.out.println("Enter the petrol price per litre");
		double price=sc.nextDouble();
		double travelcost=travelcost(dis,milg,price);
		System.out.printf("Total cost:%f",travelcost);

	}

}
