package ArraylistLab;
import java.util.Stack;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = sc.nextLine();

	        Stack<Character> stack = new Stack<>();

	        // Push each character of the word onto the stack
	        for (int i = 0; i < word.length(); i++) {
	            stack.push(word.charAt(i));
	        }

	        // Compare the word with the reversed version using the stack
	        boolean isPalindrome = true;
	        for (int i = 0; i < word.length(); i++) {
	            if (word.charAt(i) != stack.pop()) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        // Display appropriate message
	        if (isPalindrome) {
	            System.out.println("The word is a palindrome.");
	        } else {
	            System.out.println("The word is not a palindrome.");
	        }
	    }
	}


