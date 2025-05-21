package ThreadLab;

public class SimpPrinter extends Thread {
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("HEllo From Thread");
		
	}
}
}
