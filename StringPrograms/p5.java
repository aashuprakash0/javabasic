package StringPrograms;

public class p5 {
	public static void main(String[] args) {
		String s1="Deepika";
		System.out.println(s1.isEmpty());
		System.out.println("-------------------");
		System.out.println(s1.contains("Deep"));
		System.out.println("--------------------");
		String s2=s1.substring(3);
		String s3 =s1.substring(0, 5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
