import java.util.Scanner;

public class Atm {

	
	public static void main(String[] args) {

		System.out.println(
				"\nPlease select an account type.\n\nPress 1 for Checking account or press 2 for Savings account");

		Scanner sc = new Scanner(System.in);

		int selection = sc.nextInt();

		switch (selection) {

		case 1:
			

			System.out.println("Checking account selected. Press 1 to deposit or press 2 to withdraw");

			int input = sc.nextInt();

			if (input == 1) {
				Account account = new Account("checking", 0);
				System.out.println("How much do you want to deposit");
				double dep = sc.nextDouble();
				account.deposit(dep);
				System.out.println("Your new account balance is: " + account.getBalance());
				
			} else if (input == 2) {
				Account account = new Account ("checking", 0);
				System.out.println("How much do you want to withdraw");
				double dep = sc.nextDouble();
				account.withdraw(dep);
				System.out.println("Your new account balance is: " + account.getBalance());
				
			}

			else {
				System.out.println("Invalid option");
			}

			break;

		case 2:

			System.out.println("Savings account selected. Press 1 to deposit or press 2 to withdraw");

			int input1 = sc.nextInt();

			if (input1 == 1) {
				Account account = new Account("savings", 0);
				System.out.println("How much do you want to deposit");
				double dep = sc.nextDouble();
				account.deposit(dep);
				System.out.println("Your new account balance is: " + account.getBalance());
				
				
				
			} else if (input1 == 2) {
				Account account = new Account ("savings", 0);
				System.out.println("How much do you want to withdraw");
				double dep = sc.nextDouble();
				account.withdraw(dep);
				System.out.println("Your new account balance is: " + account.getBalance());
			}

			else {
				System.out.println("Invalid option");
			}

			break;

		case 3:

			System.out.println("Invalid option selected");
			break;
			
		case 4 :
			System.out.println("Main menu:\n");
			break;

		}

	}

}
