package collectionPrograms;

import java.util.ArrayList;

public class p1 {
public static void main(String[] args) {
	ArrayList a = new ArrayList(1000);
	a.add("Disha");
	a.add(100);
	a.add(25.f);
	a.add('$');
	a.add(true);
	a.add("Disha"); 
	a.add(null);
	System.out.println(a);
}
}
