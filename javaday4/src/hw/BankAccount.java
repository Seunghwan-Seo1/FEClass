package hw;

public class BankAccount {
	
	int balance;
	
	public BankAccount (int balance) {
		
		this.balance = balance;
	}
	
	public void deposit(int deposit) {
		System.out.println(deposit +"dollar deposit");
		balance += deposit;
	}
	public void withdrawal(int withdrawal) {
		System.out.println(withdrawal +"dollar withdrawal");
		balance -= withdrawal;
	}
	
	public void showBalance() {
		System.out.println("The balance of the account is " + balance);
	}

}


