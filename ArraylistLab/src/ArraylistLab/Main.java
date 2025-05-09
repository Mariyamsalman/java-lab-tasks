package ArraylistLab;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		  ArrayList<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "mariyam", 10000));
	        employees.add(new Employee(2, "omaima", 20000));
	        employees.add(new Employee(3, "manal", 30000));

	        Employee highest = employees.get(0);
	        for (Employee e : employees) {
	            if (e.salary > highest.salary) {
	                highest = e;
	            }
	        }

	        System.out.println(highest.id + " " + highest.name + " " + highest.salary);
	    }
	
	
}
