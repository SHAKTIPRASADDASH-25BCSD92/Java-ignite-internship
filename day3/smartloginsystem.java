package java_internship_assignment;
import java.util.Scanner;

public class smartloginsystem {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the username");
			String user=sc.nextLine();
			System.out.println("Enter the password");
			String pass=sc.nextLine();
			
			if(user.equals("admin")&&pass.equals("java@123"))
			{	
				System.out.println("Enter the otp");
				int otp=sc.nextInt();
				
				if(1000<otp||otp<9999)
				System.out.println("LOGIN SUCCESSFUL");
				else
				{	
				System.out.println("LOGIN UNSUCCESSFUL");
				}
			}
			
			else if(pass.equals("java123"))
			{
				System.out.println("Password almost correct");
			}
			else
			{
				System.out.println("Enter your details again!!");
					
			}
		
			
		
		
	}
}
			

	

