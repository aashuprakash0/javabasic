package Exception_programs;

public class p9 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		try {
			String s = null; 
			System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("From Catch-1");}
		catch (NullPointerException e) {
			System.out.println("From Catch-2");
		}catch(Exception e) {
			System.out.println("From Catch-3");
		}
		System.out.println("Main End");
	}

}
