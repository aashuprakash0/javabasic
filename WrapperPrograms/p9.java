package WrapperPrograms;

public class p9 {
public static void main(String[] args) {
	Character obj1 =new Character('$');
	char ch1=obj1.charValue();
	System.out.println(obj1);
	System.out.println(ch1);
	System.out.println("------------------------");
	
	Double obj2 =new Double(455.4567d);
	byte num1=obj2.byteValue();
	int num2=obj2.intValue();
	float num3=obj2.floatValue();
	
	System.out.println(obj2);
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
}
}
