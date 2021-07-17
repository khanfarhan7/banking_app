import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {

		System.out.println(
				"\nPlease select an account type.\n\nPress 1 for Checking account, press 2 for Savings account or "
						+ "press 3 to go back to the Main Menu");

		Scanner sc = new Scanner(System.in);

		int selection = sc.nextInt();

		switch (selection) {

		case 1:

			Methods met = new Methods();

			met.checkingAcctMethod(selection);

			break;

		case 2:

			Methods met1 = new Methods();

			met1.savingsAcctMethod(selection);

			break;

		case 3:
			
			Methods met2 = new Methods();
			System.out.println(
					"Main menu:\n\nPress 1 to select your checking account \nPress 2 to select your savings account");
			int input3 = sc.nextInt();
			if (input3 == 1) {
				met2.checkingAcctMethod(input3);
			}

			else if (input3 == 2) {
				met2.savingsAcctMethod(input3);
			}
			break;

		case 4:

			System.out.println("Invalid option selected");
			break;

		}
		
		sc.close();

	}

}
