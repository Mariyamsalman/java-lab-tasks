package LinkedList.Abstractionlab;

import java.util.LinkedList;

public class Main3 {

	public static void main(String[] args) {
		LinkedList<String> nodes=new LinkedList<>();
		nodes.add("Suzuki");
		nodes.add("Toyota");
		nodes.add("Bughati");

		System.out.println("before reversing list:"+nodes);
		
		System.out.println("After reversing list:"+nodes.reversed());
	}

	}


