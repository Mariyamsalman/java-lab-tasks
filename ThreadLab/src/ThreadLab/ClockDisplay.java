package ThreadLab;
import java.time.LocalTime;
public class ClockDisplay extends Thread {
	LocalTime time;
public void run4(){
	
	while(true) {
		time=LocalTime.now();
	System.out.println("current time is "+time.getHour()+":"+time.getMinute()+":"+time.getSecond());
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}}
