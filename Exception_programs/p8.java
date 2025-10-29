package Exception_programs;

public class p8 {
	public static void main(String[] args) {
		String s= "abc123" ; 
		try {
			int n = Integer.parseInt(s);
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("From Catch Block");
		}
	}

}
