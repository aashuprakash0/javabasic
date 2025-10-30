package programs;
//Write a program to print 1 to 100 without using loop.
public class p1 {
	static int num = 1; 
	public static void main(String[] args) {
		if(num==100) {
			System.out.println(num);
			num++; 
			main(null);
		}
	}

}
