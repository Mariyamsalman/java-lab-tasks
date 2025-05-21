package ThreadLab;

public class MultiTimers extends Thread {
	public void run5() {
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Timer1 has ended");
	}
public void run6() {
	try {
		sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Timer2 has ended");
}
	
public void run7() {
	try {
		sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Timer3 has ended");
}
}

