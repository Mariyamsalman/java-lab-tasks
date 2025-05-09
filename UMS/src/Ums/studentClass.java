package Ums;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class studentClass {

		void create() {
			File a=new File("student file.txt");
			try {
				if (a.createNewFile()) {
					System.out.println("student file is created");
					FileWriter b=new FileWriter("student file.txt",true);
					b.write("Name :Maryam M.salman \n id:F24BSE017 \n department:software engineering\n\n");
					b.write("Name: Omaima Sarfaraz \n id:F24BSE001 \n department:software engineering\n\n");


					b.close();
					
				}
					else{
						System.out.println("opening student file which is already created");
						
					}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
}
		 class Studentdata {
		String stdname;
		int id;
		String department;
		int studentCount=0;
		}
		 class Write extends Studentdata {
		void write(Studentdata s) {
			try {
				FileWriter b=new FileWriter("student file.txt",true);
			
			b.write("Name :"+s.stdname+ "\n id:"+s.id+ "\n department:"+s.department + "\n\n");

			
				
				b.close();
				
				
			
			} catch (IOException e1) {
			
				e1.printStackTrace();
			}	
		}	
		}
		 class display{
			 void Display() {
			 File c=new File("student file.txt");
				try {
					Scanner d=new Scanner(c);
					while(d.hasNextLine()) {
						String data;
						data=d.nextLine();
						System.out.println(data);
					
					}
					d.close();
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				}
				
			}
		 
		 void updateStudent(String studentIdToUpdate) {
			    List<Studentdata> studentList = new ArrayList<>();
			    File file = new File("student file.txt");

			    // Step 1: Read existing students into list
			    try (Scanner reader = new Scanner(file)) {
			        while (reader.hasNextLine()) {
			            String nameLine = reader.nextLine();
			            String idLine = reader.nextLine();
			            String deptLine = reader.nextLine();

			            Studentdata s = new Studentdata();
			            s.stdname = nameLine.split(":")[1].trim();
			            s.id = Integer.parseInt(idLine.split(":")[1].trim());
			            s.department = deptLine.split(":")[1].trim();
			            studentList.add(s);
			        }
			    } catch (Exception e) {
			        e.printStackTrace();
			    }

			    // Step 2: Find student to update
			    Scanner input = new Scanner(System.in);
			    for (Studentdata s : studentList) {
			        if (String.valueOf(s.id).equals(studentIdToUpdate)) {
			            System.out.println("Updating student with ID: " + s.id);
			            System.out.print("Enter new name: ");
			            s.stdname = input.nextLine();
			            System.out.print("Enter new department: ");
			            s.department = input.nextLine();
			            break;
			        }
			    }

			    // Step 3: Rewrite updated list back to file
			    try (FileWriter writer = new FileWriter("student file.txt", false)) {
			        for (Studentdata s : studentList) {
			            writer.write("Name :" + s.stdname + "\n");
			            writer.write(" id:" + s.id + "\n");
			            writer.write(" department:" + s.department + "\n\n");
			        }
			    } catch (IOException e) {
			        e.printStackTrace();
			    }

			    System.out.println("Student record updated.");
			}
		 }
	

