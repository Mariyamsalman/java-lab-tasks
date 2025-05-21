package ThreadLab;

public class Main {

	public static void main(String[] args) {
		SimpPrinter b=new SimpPrinter();
		b.start();
		try {
			b.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NumPrinter a= new NumPrinter();
		a.run1();
		CharPrint c=new CharPrint();
		c.run2();
		CountdownTimer d=new CountdownTimer();
		d.run3();
		
		MultiTimers f=new MultiTimers();
		f.run5();
		f.run6();
		f.run7();
		ClockDisplay e=new ClockDisplay();
		e.run4();
	}

}
