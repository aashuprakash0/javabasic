package Abstraction_programs;

public class Account_driver {
 
	public static void main(String[] args) {
		Account A = new Account_implementation();
		System.out.println(A.checkbalance());
		A.deposit(25000);
		System.out.println(A.checkbalance());
		A.withdraw(5000);
		System.out.println(A.checkbalance());
	}
}
