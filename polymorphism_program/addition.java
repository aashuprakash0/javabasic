package polymorphism_program;

public class addition {
	public static void add(int a , int b , int c)
	{
		int sum=a+b+c ; 
		System.out.println(sum);
	}
	public static void add(int a , float b , char c)
	{
		float sum=a+b+c ; 
		System.out.println(sum);
	}
	public static void add(String x , char y , Boolean z)
	{
		String sum=x+y+z ; 
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(10,20,30); 
		add(10,2.5f,'A');
		add("Java",'$',true);
		
	}
}
