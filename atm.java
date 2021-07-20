import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {

		System.out.println(
				"\nPlease select an option:"
				+ "\n\n1.Checking account"
				+ "\n2.Savings account"
				+"\n3.Main Menu"
				+"\n4.Check your account balance"
				+"\n5.Exit");

		Scanner sc = new Scanner(System.in);

		boolean session = true; // This variable will break the (while) loop when false

		while (session) {

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
				
				System.out.println("Press 1 to check your checking account balance"
						+ "or press 2 to check your savings account balance");
				int input4 = sc.nextInt();
				
				if (input4==1) {
					Account check1 = new Account ("checking", 0);
					System.out.println("Your Checking account balanace is "+ check1.getBalance());
				}
				
				if (input4==2) {
					Account save1 = new Account ("savings", 5000);
					System.out.println("Your Savings account balanace is "+ save1.getBalance());
				}

				break;	

			case 5:
				session = false;

				break;

			}
		}
		System.out.println("Program Ended!");
		
		sc.close();
	}

}
