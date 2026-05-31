package java_internship_assignment;

import java.util.Scanner;

public class battlearenawinner {	
	
	public static void scoreresult (double score1,double score2)
	{
		if(score1>score2)
		{	
		System.out.println("Player 1 wins!!");
		}

		else if(score1<score2)
		{	
			System.out.println("Player 2 wins!!");
		}

		else
		{	
			 System.out.println("Match draws oops!!");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the player 1 score");
		double score1=sc.nextDouble();
		System.out.println("Enter the player 2 score");
		double score2=sc.nextDouble();
		scoreresult(score1,score2);
		
	}

}
