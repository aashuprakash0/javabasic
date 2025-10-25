package Object_Programs;

public class p2 {
	int a =100 ; 
	int b=200; 
	public static void main(String[] args) {
		p2 ob1 = new p2(); 
		p2 ob2 = new p2(); 
		p2 ob3=ob1; 
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
	}

}
