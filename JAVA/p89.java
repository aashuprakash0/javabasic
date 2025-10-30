package JAVA;

public class p89 {
	public static void main(String[] args) {
		int even_sum=0;
		int odd_sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				even_sum+=i;
			}
			else 
			{
				odd_sum+=i;
			}
		}
			System.out.println("Even sum= " +even_sum);
			System.out.println("Odd sum= "+odd_sum);
		
	}

}
