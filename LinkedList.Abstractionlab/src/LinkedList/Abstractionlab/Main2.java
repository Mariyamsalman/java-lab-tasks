package LinkedList.Abstractionlab;
import java.util.LinkedList;
public class Main2 {

	public static void main(String[] args) {
		LinkedList<String> nodes=new LinkedList<>();
		nodes.add("Suzuki");
		nodes.add("Toyota");
		nodes.add("Suzuki");
		for(String Nodes:nodes) {
		System.out.println("before removing nodes in list:"+Nodes);
		}
		nodes.remove(0);
		nodes.remove(1);
		for(String Nodes:nodes) {
			System.out.println("After removing first and last node in list:"+Nodes);
	}
	}
	}


