package Abstraction_programs;

public class Account_implementation extends Account {
       double balance=50000 ; 
	public double checkbalance() {
		return this.balance ; 
	}
	public void deposit(int amt ) {
		this.balance+= amt ; 
	}
	public void withdraw(int amt) {
	this.balance -= amt ; 
	}
}
