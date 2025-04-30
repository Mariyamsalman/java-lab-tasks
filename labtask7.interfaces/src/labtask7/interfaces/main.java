package labtask7.interfaces;

public class main {

	public static void main(String[] args) {
		circle a=new circle();
		System.out.println(a.area2(2.1));
rectangle b=new rectangle();
System.out.println(b.area1(2.3, 4.1));
book c=new book();
magazine d=new magazine();
c.print();
System.out.println("books author"+c.author);
d.print();
System.out.println("magazines issue num"+d.issueNum);
calculator1 e=new calculator1();
System.out.println("the sum is"+e.add(2, 2));
System.out.println("the sum is"+e.sub(2, 2));
System.out.println("the sum is"+e.multi(2, 2));
System.out.println("the sum is"+e.div(2, 2));
car f=new car();
f.a();
bike g=new bike();
g.b();
bus h=new bus();
h.c();
	}

}
