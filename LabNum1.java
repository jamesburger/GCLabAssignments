import java.util.Scanner;

public class LabNum1 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double roomLength = 0.0;
		double roomWidth = 0.0;
		double roomArea = 0.0;
		double roomPerimeter = 0.0;
		char userCont = '-';
		String userInput = "";

		while (userCont != 'n') {
			System.out.println("Welcome to the Deluxe Room Calculator!");

			System.out.println("Please enter room width:");
			roomWidth = scnr.nextDouble();

			System.out.println("Please enter room length:");
			roomLength = scnr.nextDouble();

			roomArea = (roomLength * roomWidth);
			System.out.println("The room's area is: ");
			System.out.println(/* "%.2f",*/  roomArea);

			roomPerimeter = ((roomLength + roomWidth) * 2);
			System.out.println("The room's perimeter is: ");
			System.out.println(/* "%.2f",*/  roomPerimeter);

			System.out.println("Continue? (y/n): ");
			userInput = scnr.next();
			userCont = userInput.charAt(0);
		}
		System.out.println("Thanks for stopping by!");

	}

}
