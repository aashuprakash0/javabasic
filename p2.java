package inheritance_program;

public class p2  extends p1{
	int b = 200 ; 
	public void test2()
	{
		System.out.println("From test of p2");
	}
	public static void main(String[] args) {
		p1 ob1 = new p1() ; 
		System.out.println(ob1.a);
		ob1.test1(); 
		System.out.println("---------------------");
		p2 ob2 = new p2(); 
		System.out.println(ob2.a);
		ob2.test1();
		System.out.println(ob2.b);
		ob2.test2();
	}

}
