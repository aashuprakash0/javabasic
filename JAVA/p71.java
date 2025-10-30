package JAVA;

public class p71 {
	public static void main(String[] args) {
		int num=124679 ;
		int temp=num;
		int reverse=0 ; 
		int lastdigit; 
	while(temp!=0) {
		lastdigit=temp%10;
		reverse=reverse*10+lastdigit;
		temp=temp/10;
	}
	if(num==reverse)
	{
		System.out.println(num+"is a pallindrome");
	}
	else
	{
		System.out.println(num+"is not a pallindrome");
	}
	}

}
