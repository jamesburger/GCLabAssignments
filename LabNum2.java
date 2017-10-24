import java.util.Scanner;

public class LabNum2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int userInput = 0;
		String userName = "";

		System.out.println("Hello! Please enter your name!");
		userName = scnr.next();

		System.out.println("OK " + userName + ", please enter a number between"
				+ " '1' and '100' (0 to exit):");
		userInput = scnr.nextInt();

		while (userInput != 0) {

			int userCompare = userInput % 2;

			if ((userInput <= 100) && (userInput >= 0)) {
				if ((userCompare == 1) && (userInput < 60)) {
					System.out.println("Odd");
				} else if ((userCompare == 0) && (userInput <= 25)) {
					System.out.println("Even and less than 25");
				} else if ((userCompare == 0) && (userInput <= 60) && (userInput >= 26)) {
					System.out.println("Even");
				} else if ((userCompare == 0) && (userInput >= 60)) {
					System.out.println(userInput + " Even");
				} else if ((userCompare == 1) && (userInput >= 60)) {
					System.out.println(userInput + " Odd and over 60");
				}
			}

			else {
				System.out.println("Sorry " + userName + ", that is not a valid number!");

		}

			System.out.println("Enter '0' to exit or enter another number!");
			userInput = scnr.nextInt();
		}
		System.out.println("Thanks for playing " + userName + "!");
	}
}
