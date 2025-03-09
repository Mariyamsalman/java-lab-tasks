package labtasks1;

public class Bankaccount {
	String accountNumber;
	double balance=20.00;
	void deposit(double amount){
		balance=balance+amount;
		return;
	}
	void displayBalance() {
		System.out.println(balance);
		return;
	}
}
