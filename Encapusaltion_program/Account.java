package Encapusaltion_program;

public class Account {
private double Balance=50000 ; 
 /*Getter Method*/
public double Balancecheck( ) {
	return this.Balance;
}
/*Setter Method*/
public void deposit(int amt ) {
         this.Balance += amt; 	
}
/*Setter Method*/
public void withdrawt(int amt ) {
         this.Balance -= amt; 	
}
}
