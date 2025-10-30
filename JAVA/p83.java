package JAVA;

public class p83 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5 ; 
		int i=1;
		do {
			int j=1;
			do {
			System.out.print("*");
			j++;
			}while(j<=coloumn);	
			System.out.println("*");
			i++;
		}while(i<=row);
}
}
