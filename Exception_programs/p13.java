package Exception_programs;

public class p13 {
	static
	{
		System.out.println("From Static Block of p13");
	}
	public static void main(String[] args)  {
		System.out.println("From main of p13");
		try {
			Class.forName("Exception.p12");
		} catch (ClassNotFoundException e) {
			System.out.println("From Catch Block");
			System.out.println(e);
		}
	}

}
