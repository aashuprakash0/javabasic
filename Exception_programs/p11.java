package Exception_programs;

public class p11 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			test1();
		} catch (ArithmeticException e) {
			System.out.println("From Catch block");
		}
		System.out.println("main end");
	}
	public static void test1() {
		System.out.println("test-1 Begin");
		test2();
		System.out.println("test-1 End");
	}
	public static void test2() {
		System.out.println("test-2 begin");
		int c =10/0 ;
		System.out.println(c);
		System.out.println("test-2 End");
	}

}
