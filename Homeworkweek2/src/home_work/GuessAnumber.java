package home_work;

import java.util.Scanner;

public class GuessAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int secnum = 6;
		int guess;
		boolean statement = true;
		Scanner picknum = new Scanner(System.in);
		
		
		while (statement) {
	System.out.println("chose a number between 1 and 10. Try to guess it.");
	guess = picknum.nextInt();
	
	if(guess==secnum) {
	statement = false;
		System.out.println("guess is correct");
	
	}
	if(guess!=secnum) {
		
			System.out.println("guess is  not correct");
		
		}
	}
	
	
	}

}

