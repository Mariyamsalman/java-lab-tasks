package LinkedList.Abstractionlab;

public class currentAccount5 extends absBankAcc5 {

	int bankBal=10000;
	int deposit(int a) {
	
		bankBal=bankBal+a;
		return bankBal;
	}

	int withDraw(int a) {
		
		bankBal=bankBal-a;
		return bankBal;
	}
	int getBalance() {
		
		return bankBal;
	}
}
