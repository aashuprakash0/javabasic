package Encapusaltion_program;

public class Account_driver {
	public static void main(String[] args) {
		Account a = new Account() ; 
		System.out.println(a.Balancecheck());
		a.deposit(25000);
		System.out.println(a.Balancecheck());
		a.withdrawt(10000);
		System.out.println(a.Balancecheck());
	}

}
