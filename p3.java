package inheritance_program;

public class p3 extends p2{
	int c = 300 ; 
	public void test3()
	{
		System.out.println("From test of p3");
	}
	public static void main(String[] args) {
		p3 ob = new p3(); 
		System.out.println(ob.a);
		ob.test1();	
		System.out.println(ob.b);
		ob.test2();	
		System.out.println(ob.c);
		ob.test3();	
		System.out.println("--------------------------");
		p3 ob1 = new p3(); 
		System.out.println(ob1.a);
		ob1.test1();	
		System.out.println(ob1.b);
		ob1.test2();	
		System.out.println(ob1.c);
		ob1.test3();
	}

}
