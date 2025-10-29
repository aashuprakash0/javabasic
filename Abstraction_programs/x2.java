package Abstraction_programs;

public class x2 implements x1 {
	 public void test1() {
		 System.out.println("From test1 of x2 ");
	 }
	 public void test2() {
		 System.out.println("From test2 of x2");
	 }
	 public static void main(String[] args) {
		x2 ob = new x2();
		ob.test1();
		ob.test2();
	}

}
