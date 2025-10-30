package JAVA;

public class p70 {
	public static void main(String[] args) {
		int num=4567; 
		int temp =num;
		int reverse=0;
		int lastdigit;
	while(temp!=0) {
		lastdigit=temp%10;
		reverse=reverse*10+lastdigit;
		temp=temp/10;
	}
	System.out.println("Reverse = "+reverse);
	}

}
