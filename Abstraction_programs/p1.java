package Abstraction_programs;

public class p1 implements I1,I2,I3{
	public void test1() {
		System.out.println("From test1 of p2");
	}
	public void test2() {
		System.out.println("From test2 of p2");
	}
	public void test3() {
		System.out.println("From test3 of p2");
	}
	public static void main(String[] args) {
		p1 ob = new p1();
		ob.test1();
		ob.test2();
		ob.test3();
		System.out.println("----------------------");
		I1 ob2=ob ;    /* Upcasting */
		ob2.test1();
		System.out.println("----------------------------");
		I2 ob3 = (I2) ob2 ;
		ob3.test2();
		System.out.println("--------------------------");
	    I3 ob4 = (I3) ob3 ;
	    ob3.test2();

		
	}

}
