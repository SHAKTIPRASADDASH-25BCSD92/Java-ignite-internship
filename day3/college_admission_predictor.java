package java_internship_assignment;
import java.util.Scanner;

public class college_admission_predictor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of maths");
		int math=sc.nextInt();
		System.out.println("Enter the marks of physics");
		int phy=sc.nextInt();
		System.out.println("Enter the marks of maths");
		int chem=sc.nextInt();
		double avg=(math+phy+chem)/3;
		
		if((math>=70&&phy>=60&&chem>=60)||avg>=80)
		{
			System.out.println("Your Student is eligible for admission");
			
			if(math>90&&chem>90&&phy>90) 
			{
				System.out.println("Scholarship has been awarded!!");
			}
			else
				System.out.println("No Scholarship has been awarded");
				
		}
		else if((math<35||phy<35||chem<35))
		{
			System.out.println("Your Student is not eligible for admission");
		}
		else
			System.out.println("Your Student is not eligible for admission");
		
	}	

}
