package LinkedList.Abstractionlab;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int amount;
		absBankAcc5 a=new savingAccount5();
		absBankAcc5 b=new currentAccount5();
System.out.println("Enter amount you want to deposit in your saving acc");
amount=input.nextInt();
input.nextLine();
a.deposit(amount);

System.out.println("Enter amount you want to withdraw from your saving acc");
amount=input.nextInt();
input.nextLine();
a.withDraw(amount);

System.out.println("This is your bank balance in saving acc"+a.getBalance());

System.out.println("Enter amount you want to deposit in your current acc");
amount=input.nextInt();
input.nextLine();
b.deposit(amount);

System.out.println("Enter amount you want to withdraw from your current acc");
amount=input.nextInt();
input.nextLine();
b.withDraw(amount);

System.out.println("This is your bank balance in current acc"+b.getBalance());
	}

}
