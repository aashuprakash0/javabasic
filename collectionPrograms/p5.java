package collectionPrograms;

public class p5 {
public static void main(String[] args) {
	String[] a= {"Disha","Deepika","Thamanaha","Katrina"}; 
	for(String lv:a) 
	{
		System.out.println(lv);
	}
	System.out.println("---------------------------------");
	
	int [] b= {10,20,30,40,50}; 
	for(int lv:b) 
	{
	System.out.println(lv);
	}
	System.out.println("------------------------");
	Object [] c= {"Disha",12.456,'$',true};
	for(Object lv:c) 
	{
	System.out.println(c);	
	}
	System.out.println("-------------------------");
}
}
