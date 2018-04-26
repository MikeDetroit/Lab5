
// Michael DeCoopman, Java, Lab5, 4-25-2018

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		int userNum;
		long factorial = 1;

		Scanner scan = new Scanner(System.in);

		String cont ;

		System.out.println("Welcome to the factorial Calculator!");
		System.out.println();

		do {
			System.out.println("Enter an integer that's greater than 0 but less than 10");
			userNum = scan.nextInt();

			while (userNum < 0 || userNum > 10) {
				System.out.println("Number not in range, please try again. ");
				userNum = scan.nextInt();
			}

			for (int i = 1; i <= userNum; i++) {
				factorial = factorial * i;
			}
				System.out.println("The factorial of " + userNum + " is " + factorial);
				System.out.println("Continue? ");
				cont = scan.next();
				factorial = 1;

			

		} while (cont.equalsIgnoreCase("Y"));

		scan.close();
	}
}
