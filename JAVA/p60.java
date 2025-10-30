package JAVA;
/*WAP to perform addition ,subtraction or multiplication on two number */
public class p60 {
	public static void main(String[] args) {
		int a=100, b=50 ;
		char operator='+'; 
	switch (operator) {
	case ('+'): 
	{
		int sum =a+b ; 
		System.out.println("sum= "+sum);
	}
	case ('-'): 
	{
	    int diff = a-b ;
	    System.out.println("diff= "+diff);
	}
	case('*'): 
	{
		int product=a*b ; 
		System.out.println("Sum= "+product);
	}
	}	
	}

}
