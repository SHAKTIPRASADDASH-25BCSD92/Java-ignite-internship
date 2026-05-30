package java_internship_assignment;
import java.util.Scanner; 
public class atmpin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Correctpin=9756;
		while(true)
		{	
			System.out.println("Enter the correct pin");
			int pin=sc.nextInt();
		if(pin==Correctpin)
		{	
			System.out.println("Login Successful");
			break;
		}
		else
		{	
			System.out.println("Wrong pin ");
		}
		}
	}

}
