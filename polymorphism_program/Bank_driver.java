package polymorphism_program;
public class Bank_driver {
public static void main(String[] args) {
     Bank b1 = new ICIC();
     Bank b2 = new HDFC();
     Bank b3 = new Axis();
     Bank [] x = {b1,b2,b3} ;
     for(int i = 0 ; i<3;i++) {
    	 System.out.println(x[i].rateofinterest());
     } 
    	 
     
     
     
}
}
