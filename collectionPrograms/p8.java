package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class p8 {
public static void main(String[] args) {
	ArrayList<String>a=new ArrayList();
	a.add("Disha");
	a.add("Thamnaha");
	a.add("Deepika");
	a.add("Katrina");
	a.add("Pooja");
	System.out.println(a);
	System.out.println("-------------------------------------");
	
	Iterator<String>itr=a.iterator();
	while(itr.hasNext()) {
		String s=itr.next();
		System.out.println(s);
		if (s.contentEquals("Katrina")) {
			itr.remove();
		}
	}
	System.out.println("---------------------------------------");
	System.out.println(a);
	
	
}
}
