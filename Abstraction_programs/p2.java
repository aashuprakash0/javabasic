package Abstraction_programs;

public class p2 extends p11 implements I4 {
	public void test2() {
		System.out.println("From test2 of p2");
	}
    public static void main(String[] args) {
		I4 ob = new p2();
		ob.test1();
		ob.test2();
	}
	
}
