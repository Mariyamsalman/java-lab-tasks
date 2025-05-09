package ArraylistLab;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int j = 0; j < 5; j++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original list: " + list);

        int n = list.size();
        for (int k = 0; k < n / 2; k++) {
            int temp = list.get(k);
            list.set(k, list.get(n - 1 - k));
            list.set(n - 1 - k, temp);
        }

        System.out.println("Reversed list: " + list);
    }

	}


