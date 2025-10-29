package Exception_programs;

public class p7 {
	public static void main(String[] args) {
		System.out.println("From Main Begin");
		int a=10;
		int b=0;
		System.out.println(a);
		System.out.println(b);
		try {
			System.out.println("Try-1");
			int c=a/b; 
			System.out.println(c);
			System.out.println("Try-2");
			
		} catch (ArithmeticException e) {
			System.out.println("From Catch block");
		}
		System.out.println("From Main End");
	}

}
