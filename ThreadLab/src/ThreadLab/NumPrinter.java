package ThreadLab;

public class NumPrinter extends Thread{
	public void run1() {
		for(int i=1;i<=5;i++) {
			System.out.println("Number:"+i);
		}
	}
}
