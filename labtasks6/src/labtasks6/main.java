package labtasks6;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	
Scanner input=new Scanner(System.in);

int a,base,exponent,num1,num2,number1,number2,number3;

System.out.println("enter a number:");
a=input.nextInt();

javamath q=new javamath();

q.squarerootfinder(a);
q.RandomNumberGenerator();

System.out.println("enter a base:");
base=input.nextInt();
System.out.println("enter a exponent:");
exponent=input.nextInt();
q.power(base, exponent);

System.out.println("enter num1:");
num1=input.nextInt();
System.out.println("enter num2");
num2=input.nextInt();
q.absolutediff(num1, num2);

System.out.println("enter num1 to find max:");
number1=input.nextInt();
System.out.println("enter num2 to find max:");
number2=input.nextInt();
System.out.println("enter num3 to find max:");
number3=input.nextInt();
q.max(number1, number2, number3);

javaarrays w=new javaarrays();
w.sum();
w.maximum();
w.reverse();
w.even();
	}

}
