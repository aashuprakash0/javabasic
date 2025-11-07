package collectionPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class p7 {
public static void main(String[] args) {
	Vector<String>v=new Vector<String>();
	v.add("Deepika");
	v.add("Thamanaha");
	v.add("Katrina");
	v.add("Disha");
	v.add("Pooja");
	 System.out.println(v);
	 System.out.println("-----------------------");
	 Enumeration<String>e =v.elements();
	 while(e.hasMoreElements()) {
		String s =e.nextElement(); 
		System.out.println(s);
	 }
	 System.out.println("-----------------------");
	 System.out.println(v);
	
}
}
