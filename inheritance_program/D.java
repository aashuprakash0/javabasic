package inheritance_program;

public class D extends C{
	public static void main(String[] args) {
		 A ob1 = new A();
		 B ob2 = new B(); 
		 System.out.println(ob1 instanceof A);
		 System.out.println(ob1 instanceof B);
		 System.out.println(ob2 instanceof A);
		 System.out.println(ob2 instanceof B);
	}

}
