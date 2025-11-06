package collectionPrograms;

import java.util.ArrayList;
import java.util.LinkedList;

public class p4 {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>();
	a.add("Disha");
	a.add("Deepika");
	a.add("Katrina");
	a.add("Pooja");
	a.add("Disha"); 
	System.out.println(a);
	System.out.println("-----------------------------");
	
	LinkedList<String>l=new LinkedList<String>(a);
	System.out.println(l);
}
}
