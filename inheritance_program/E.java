package inheritance_program;

public class E extends B {
public static void main(String[] args) {
	B ob2 = new B();
	if (ob2 instanceof A) {
		A ob1 = (A) ob2; /*Downcasting*/ 
		System.out.println("object downcated");	
	} else {
		System.out.println("unable to downcaste");

	}
}
}
