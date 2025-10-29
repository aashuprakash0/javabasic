package Exception_programs;

public class p16 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		try {
			test1();
		} catch (ClassNotFoundException e) {
		  System.out.println("Catch Block");
		}
		System.out.println("Main End");
	}
	public static void test1() throws ClassNotFoundException {
		System.out.println("test-1 Begin");
		test2();
		System.out.println("try-1 End");
	}
	public static void test2() throws ClassNotFoundException {
		System.out.println("test-2 Begin");
			Class.forName("abc");
		System.out.println("try-2 End");
	}

}
