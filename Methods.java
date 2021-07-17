import java.util.Scanner;

public class Methods {
	
	Scanner sc = new Scanner(System.in);

	public void checkingAcctMethod (int a) {
		
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
		
		
	}
	
	public void savingsAcctMethod (int a) {
		
		System.out.println("Savings account selected. Press 1 to deposit or press 2 to withdraw");

		int input1 = sc.nextInt();

		if (input1 == 1) {
			Account account = new Account("savings", 0);
			System.out.println("How much do you want to deposit");
			double dep = sc.nextDouble();
			account.deposit(dep);
			System.out.println("Your new account balance is: " + account.getBalance());
			
			
			
		} else if (input1 == 2) {
			Account account = new Account ("savings", 5000);
			System.out.println("How much do you want to withdraw");
			double dep = sc.nextDouble();
			account.withdraw(dep);
			System.out.println("Your new account balance is: " + account.getBalance());
		}

		else {
			System.out.println("Invalid option");
		}
		
	}
	
	
}
