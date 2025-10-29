package Exception_programs;

import java.util.Scanner;

public class p17 {
	static final int ActualPin=2003; 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Pin");
		 int EnteredPin = sc.nextInt(); 
		 if (EnteredPin==ActualPin) {
			 System.out.println("Transaction Continue");
		} else {
			System.out.println("Transaction Declined");
			throw new ArithmeticException();
		}
	}

}
