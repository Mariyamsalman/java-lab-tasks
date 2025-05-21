package ThreadLab;

public class CountdownTimer extends Thread {
	public void run3() {
for(int i=10;i>=1;i--) {
	System.out.println("Number count down timer:"+i);
try {
	sleep(1000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
}
	}
	}
