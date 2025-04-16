package labtasks6;

public class javamath {
void squarerootfinder(int a) {
	System.out.println("this is the square root:"+Math.sqrt(a));
	return;
}
void RandomNumberGenerator() {
	System.out.println("these are the random numbers");
	
	for(int i=1;i<=5;i++) {
	System.out.println((int)(Math.random() * 100) + 1);
	
	}
	return;
}
void power(int base,int exponent) {
	System.out.println("this is the power of:"+base+" "+Math.pow(base, exponent));
	return;
}
void absolutediff(int num1,int num2) {
	System.out.println("this is the absolute diff:"+Math.abs(num2-num1));
	return;
}
void max(int n1,int n2,int n3) {
	System.out.println("this is the largest number:"+Math.max(n1, Math.max(n2, n3)));
	return;
}



}
