package inheritance_program;

public class B extends A {
 int y = 200 ; 
 public void test2()
 {
	 System.out.println("From test2 of B ");
 }
 public static void main(String[] args) {
	 B ob1 = new B(); 
	 System.out.println(ob1.x);
	 ob1.test1(); 
	 System.out.println(ob1.y);
	 ob1.test2(); 
	 System.out.println("------------------------------");
	 A ob2 = ob1 ; 
	 System.out.println(ob2.x);
	 ob2.test1();
	
}
}
