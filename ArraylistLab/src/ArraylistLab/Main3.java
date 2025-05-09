package ArraylistLab;
import java.util.Stack;
public class Main3 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

        stack.push("The Catcher in the Rye");
        stack.push("To Kill a Mockingbird");
        stack.push("1984");
        stack.push("The Great Gatsby");
        stack.push("Moby Dick");

        System.out.println("Popped books:");
        System.out.println(stack.pop()); // Pop and display first book
        System.out.println(stack.pop()); // Pop and display second book

        System.out.println("\nRemaining books in stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Pop remaining books one by one
        }
    }

	}


