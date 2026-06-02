package java_internship_assignment;
import java.util.Scanner;
class Batsman
{	
	String playername;
	int runs=0,balls=0;
	double strikerate=0;
	Batsman(String n,int r,int b)
	{		
		playername=n;
		runs=r;
		balls=b;
		if(balls>0)
		{
			strikerate=(runs*100)/balls;
		}
		else
			strikerate=0;
	}
	void display(){
		System.out.println("Player Name:"+(playername));
		System.out.println("StrikeRate:"+(strikerate));
	}
	
	
}

public class cricketmatchscorecard {

	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the playername,runs,balls");
		String playername=sc.nextLine();
		int runs=sc.nextInt();
		int balls=sc.nextInt();
		Batsman b1=new Batsman(playername,runs,balls);
		b1.display();
		
		
	}

}
