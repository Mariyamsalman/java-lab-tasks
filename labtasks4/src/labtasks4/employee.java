package labtasks4;

public class employee {
	
public double calculatebonus(int salary) {
	return salary*0.05;
}
public double calculatebonus(double salary,int rating) {
	if(rating==5) {
		salary=salary*0.2;
	}
	if(rating==4) {
		salary=salary*0.15;
	}
	if(rating==3) {
		salary=salary*0.1;
	}
	if(rating==2) {
		salary=salary*0.05;
	}
	if(rating==1) {
		salary=salary;
		System.out.println("no bonus on 1 rating");
	}
	return salary;
	
}
}
