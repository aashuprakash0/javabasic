package StringPrograms;

public class p7 {
public static void main(String[] args) {
	String s1="  Kirana Anshika  "; 
	String s2=s1.trim();
	String s3=s2.replace("Anshika", "Anjali");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s3.indexOf('a'));
	System.out.println(s3.lastIndexOf('a'));
	
}
}
