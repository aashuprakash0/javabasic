package JAVA;

public class p82 {
	public static void main(String[] args) {
		int even_sum=0;
		int odd_sum=0;
		int i=1;
		do { 
			if(i%2==0) {
				even_sum+=i;
			}
			
			else {
				odd_sum+=i;
			}
			i++;
		}while(i<=20);
	  System.out.println("Even_sum= "+even_sum);
	  System.out.println("Odd_sum= "+odd_sum);
	}

}
