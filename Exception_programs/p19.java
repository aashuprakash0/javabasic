package Exception_programs;

public class p19 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		try {
			int a=10/0; 
		} finally {
			System.out.println("Final Block");
		}
		System.out.println("Main End");
		}
	}


