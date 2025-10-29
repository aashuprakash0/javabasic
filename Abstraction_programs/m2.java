package Abstraction_programs;

public class m2  extends m1{

	public void test1() {
		System.out.println("From test of m1");
	}
	
	public void test2() {
		System.out.println("From test of m2");
	}
	 public m2() {
		 System.out.println("From Constructor of m2");
	 }
	public static void main(String[] args) {
		m1 ob = new m2();
		ob.test1();
		ob.test2();	
	}
	
}
