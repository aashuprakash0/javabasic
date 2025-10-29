package Exception_programs;

public class P18 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		try {
			int a=10/0;
		} catch (ArithmeticException e) {
			System.out.println("From Catch Block");
		} finally {
			System.out.println("Finally Block");
		}
		System.out.println("Main End");
	}

}
