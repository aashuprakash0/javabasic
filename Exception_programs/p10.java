package Exception_programs;

public class p10 {
 public static void main(String[] args) {
	System.out.println("Main Begin");
	try {
		Integer.parseInt("abc123"); 
	} catch (NullPointerException e) {
		System.out.println("From Catch-1");
	}catch (RuntimeException e) {
		System.out.println("From Catch-2");
	}catch (Exception e) {
		System.out.println("From Catch-3");
	}
	System.out.println("Main End");
}
}
