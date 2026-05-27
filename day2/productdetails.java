package java_internship_assignment;
import java.util.Scanner;

public class productdetails {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter customers name");
		String name=sc.nextLine();
		System.out.println("Enter product name");
		String prname=sc.nextLine();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter product quantity");
		int prnum=sc.nextInt();
		System.out.println("****TOTAL BILL*****");
		System.out.println("CUSTOMERS NAME:"+name);
		System.out.println("PRODUCT:"+prname);
		System.out.println("PRICE:"+price);
		System.out.println("QUANTITY:"+prnum);
		System.out.println("GRAND TOTAL:"+(price*prnum));
		System.out.println("THANK YOU!!\n HAVE A GREAT DAY...");
		
		
		
		
		
		
		





	}

}
