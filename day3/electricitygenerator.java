package java_internship_assignment;
import java.util.Scanner;

public class electricitygenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the units consumed");
		double units=sc.nextDouble();
		System.out.println("Enter the choice\n1-DOMESTIC \n2-COMMERCIAL\n3-INDUSTRIAL");
		int choice=sc.nextInt();
		switch(choice)
		{	
		case 1:
		{	if(units<=100)
			{System.out.println("TOTAL BILL=0");
			break;
			}
			
			else if(units>100&&units<=300)
			{	
				System.out.printf("TOTALBILL=%f",(units-100)*5);
				break;
			}
		
			else if(units>300)
				System.out.printf("TOTALBILL=%f",((units-300)*8+1000));break;
		}
		case 2:
		{	if(units<=200)
			{System.out.printf("TOTAL BILL=%f",(units*10));
			break;
			}
			
			else if(units>200)
			System.out.printf("TOTALBILL=%f",(units-200)*15+2000);break;
		}
		case 3:
		{	if(units<=500)
			{
				System.out.printf("TOTALBILL=%f",(units*20));
				break;
			}
		
			System.out.println("Powerfactor status Good\nEnter true/false");
			boolean pf=sc.nextBoolean();
			if(units>500&&pf==(true))
				{	
					System.out.printf("TOTAL BILL=%f",((units*20)-(0.1*units*20)));
					break;
				}
				else if(units>500&&pf==(false))
				System.out.printf("TOTALBILL=%f",(units*20));
				break;
		}
					
		default:System.out.println("Invalid connection type");
		}
		
				
		
		
		

		}

}
