package collectionPrograms;
import java.util.ArrayList;
import java.util.LinkedList;
public class p6 {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>();
	a.add("Disha");
	a.add("Deepika");
	a.add("Katrina");
	a.add("Pooja");
	a.add("Disha"); 
	System.out.println(a);
	for (String lv:a) {
		System.out.println(lv);
	}
	System.out.println("-----------------------------");
	
	LinkedList l = new LinkedList();
	l.add("Disha");
	l.add(100);
	l.add(25.f);
	l.add('$');
	l.add(true);
	l.add("Disha"); 
	l.add(null);
	System.out.println(l);
	for (Object lv : l) {
		System.out.println(lv);
	}
	
}
}
