package collectionPrograms;


import java.util.Vector;

public class p2 {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("Disha");
	v.add(100);
	v.add(25.f);
	v.add('$');
	v.add(true);
	v.add("Disha"); 
	v.add(null);
	System.out.println(v);
}
}
