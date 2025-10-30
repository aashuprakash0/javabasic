package JAVA;

public class p72 {
	public static void main(String[] args) {
		int row=5; 
		int coloumn=5;
		int i= 0; 
		while(i<row) {
			int j=1;
			while(j<coloumn) {
				System.out.print("*");
				j++;
			}
			System.out.println("*");
			i++;
		}
	}

}
