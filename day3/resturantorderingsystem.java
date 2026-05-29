package java_internship_assignment;

import java.util.Scanner;

public class resturantorderingsystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Veg/Nonveg meal");
		String meal=sc.nextLine();
		System.out.println("Enter the member status \n1-Gold \n2-Silver\n3-Normal");
		String member=sc.nextLine();
		int total=0;
		switch(meal)
		{	
		case "Nonveg":
		{	System.out.println("Enter the Food\n1-chikenbiriyani-Rs200\n2-Grill chicken-Rs250\n");
			int menu=sc.nextInt();
			System.out.println("Enter the Quantity");
			int qty=sc.nextInt();
			switch(menu)
			{
			case 1:
			{	total=200*qty;
				break;
			}
			case 2:
			{	total=250*qty;
				break;
			}
			default:
			{	
				System.out.printf("This food item not available");
			}
			}
			break;
		}
		case "Veg":
		{	System.out.println("Enter the Food\n1-Fried rice-Rs170\n2-Noodles-Rs220\n");
			int menu=sc.nextInt();
			System.out.println("Enter the Quantity");
			int qty=sc.nextInt();
			switch(menu)
			{
				case 1:
			{	total=170*qty;
				break;
			}
			case 2:
			{	
				total=220*qty;
				break;
			}
			default:
			{	total=0;
				System.out.printf("This food item not available");
				break;
			}
			}
		break;
		}
	default:System.out.println("Wrong Input");
		}
		switch(member)
		{
			case "Gold":
			{	if(total>2000)
				{
					System.out.println("Total bill:"+((total-(0.2*total))));
					System.out.println("Free desert as a complimentary");
					break;
				}
				else 
				{
					System.out.println("Total bill:"+((total-(0.2*total))));
					break;
				}}
			case "Silver":
			{	
				System.out.println("Total bill:"+((total-(0.1*total))));
				break;
			}
			case "Normal":
			{	
				System.out.println("Total bill:"+(total));
				break;
			}
		}
	}
}





