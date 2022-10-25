package miniProject1;

import java.util.Scanner;

public class MiniProject1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number;
		int counter = 0;
		int rand = (int) (0 + (Math.random() * 100));
		int again = 0;
		
		System.out.println("Guess the number between 1 to 100");

		do {
			if (again == 1) {
				System.out.println("Guess the number between 1 to 100");
				rand = (int) (0 + (Math.random() * 100));
				again = 0;

			}
			counter++;
			number = scan.nextInt();
			boolean win = guessNumber(rand, number);

			if (win == true) {
				System.out.println("Correct! You got it right in " + counter + " guesses");
				
				System.out.println("Press 1 to play again. Press 2 to exit");
				again = scan.nextInt();

			}

		} while (again != 2);

		System.out.println("Goodbye");
		scan.close();
	}

	static boolean guessNumber(int randNumber, int selectNumber) {
		if (randNumber > selectNumber) {

			System.out.println("Higher");
			return false;

		} else if (randNumber < selectNumber) {

			System.out.println("Lower");
			return false;

		}
		return true;
	}
}