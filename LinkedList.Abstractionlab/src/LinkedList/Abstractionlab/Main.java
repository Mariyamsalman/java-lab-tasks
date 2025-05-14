package LinkedList.Abstractionlab;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		LinkedList<String> nodes=new LinkedList<>();
		nodes.add("Suzuki");
		nodes.add("Toyota");
		nodes.add("Suzuki");
		for(String Nodes:nodes) {
		System.out.println("before Adding list:"+Nodes);
		}
		nodes.add(0,"Ferrari");
		nodes.add("Bughati");
		for(String Nodes:nodes) {
			System.out.println("After Adding first and last node in list:"+Nodes);
	}
	}
	
}
