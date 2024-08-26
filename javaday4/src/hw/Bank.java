package hw;

public class Bank {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000);
		
		account.deposit(500);
		account.withdrawal(1000);
		account.showBalance();
	}
}
