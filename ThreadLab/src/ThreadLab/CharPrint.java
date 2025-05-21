package ThreadLab;

public class CharPrint extends Thread{
	public void run2() {
		for(char i='A';i<='E';i++) {
			System.out.println(i);
		}
	}
}
