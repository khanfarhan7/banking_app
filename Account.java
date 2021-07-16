
public class Account {

	String type;
	double balance;
	
	
	public Account(String type, double balance) {
		super();
		this.type = type;
		this.balance = balance;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit (double dep) {
		
		balance += dep;
	}
	
	public void withdraw (double wit) {
		balance -= wit;
		
	}
	
	
	
	
}
