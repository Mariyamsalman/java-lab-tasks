package labtasks1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 person a1=new person();
         //person a2=new person();
         a1.displayInfo();
         Rectangle area=new Rectangle();
         System.out.println(area.calcArea(20.7, 2.89));
         Calc c=new Calc();
         System.out.println(c.sum(44, 21));
         System.out.println(c.product(31, 20));
         Bankaccount a=new Bankaccount();
         a.deposit(209);
         a.displayBalance();
         Student b=new Student();
	     b.checkPass();
	}

}
