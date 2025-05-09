package Ums;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		int no;
		Scanner input=new Scanner(System.in);
		
	studentClass a=new studentClass();
    a.create();
    Studentdata b=new Studentdata();
    System.out.println("welcome to the UMS here are different features you can access:");
    
		do {
			System.out.println("1. view Student info");
			System.out.println("2. Add students");

			System.out.println("enter your choice");
			no=input.nextInt();
			input.nextLine();
			switch(no) {
			case 1:
			{
				 display d=new display();
				 d.Display();
				 break;
						 }
			case 2:
			{

				System.out.println("Enter student name:");
				b.stdname=input.nextLine();
				System.out.println("Enter student id:");
				b.id=input.nextInt();
				input.nextLine();
				System.out.println("Enter student department:");
				b.department=input.nextLine();
				Write e=new Write();
				e.write(b);
				break;
						}
			case 3:
			    studentClass updater = new studentClass();
			    updater.updateStudent();
			    break;

			
			}
		}while(no!=9);
		input.close();
	} 
	}
    


