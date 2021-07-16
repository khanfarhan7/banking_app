import java.util.Scanner;

public class atm {

	public static void main(String[] args) {

		System.out.println(
				"\nPlease select an account type.\n\nPress 1 for Checking account or press 2 for Savings account");

		Scanner sc = new Scanner(System.in);

		int acctType = sc.nextInt();

		switch (acctType) {

		case 1:

			System.out.println("Checking account selected. Press 1 to deposit or press 2 to withdraw");

			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("User has chosen deposit into their checking account");
			} else if (input == 2) {
				System.out.println("User has chosen to withdraw from their checking account");
			}

			else {
				System.out.println("Invalid option");
			}

			break;

		case 2:

			System.out.println("Savings account selected. Press 1 to deposit or press 2 to withdraw");

			int input1 = sc.nextInt();

			if (input1 == 1) {
				System.out.println("User has chosen to deposit into their savings account");
			} else if (input1 == 2) {
				System.out.println("User has chosen to withdraw from their savings account");
			}

			else {
				System.out.println("Invalid option");
			}

			break;

		case 3:

			System.out.println("Invalid option selected");
			break;

		}

	}

}
