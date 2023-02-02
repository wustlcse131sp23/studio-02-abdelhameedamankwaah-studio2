package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double startAmount = 200.0;
		double winLimit = 300.0;
		int numPlays = 0;
		
		for (int totalSimulations = 0; totalSimulations < 5; totalSimulations++)
		{
			while (startAmount < winLimit && startAmount > 0)
			{	
			double winChance = Math.random();

			if (winChance < .5)
			{
				startAmount--;
				numPlays++;
			}
			else if (winChance > .5)
			{
				startAmount++;
				numPlays++;

			}
			
			
			}	
			
		 if(startAmount == winLimit && totalSimulations <= 5)
		 {
			System.out.println("Success "+ totalSimulations + " " + numPlays);
			numPlays = 0;
			startAmount = 200.0;
			winLimit = 300.0;
		 }	
		 
		 else if (startAmount == 0 && totalSimulations <= 5)
		{	
			System.out.println("Ruin " + totalSimulations + " " + numPlays);
			numPlays = 0;
			startAmount = 200.0;
			winLimit = 300.0;


		}
		 
		}
		
	}

	}

