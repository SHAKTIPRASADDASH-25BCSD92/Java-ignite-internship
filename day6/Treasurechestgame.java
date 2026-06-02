package java_internship_assignment;
import java.util.Scanner;
class Treasurechest
{	
	String player_name;
	int coins;
	String r;
	Treasurechest(String n,int c)
	{	
		player_name=n;
		coins=c;
		
		if(c>=1000)
		
		{	
			r="Diamond Sword";
		}
		else if(c>=500)
		{	
			r="Gold sword";
		}
		else if(c>=100)
		{	
			r="Iron sword";
		}
		
		else
		{	
			r="WoodenSword";
		}
	}
	void display()
	{	
		System.out.println("PlayersName:"+(player_name));
		System.out.println("Reward:"+(r));
	}
}
		
public class Treasurechestgame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Players Name");
		String name=sc.nextLine();
		System.out.println("Enter no of coins collected");
		int coins=sc.nextInt();
		Treasurechest p1=new Treasurechest(name,coins);
		p1.display();
		
	}

}
