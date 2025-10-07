package inheritance_program;

public class C extends B {
	int z=300 ; 
	public void test3()
	{
		System.out.println("From test 3 of C");
	}
  public static void main(String[] args) {
		B ob1 = new C();
		System.out.println(ob1.x);
		ob1.test1();
		System.out.println(ob1.y);
		ob1.test2(); 
		
    
}
	

}
