class p70
{
	public static void main(String[] args) 
	{
		int num=456;
		int temp=num;
		int reverse=0;
		int lastdigit=0;
		while(temp!=0)
		{
			lastdigit=temp%10;
			reverse=reverse*10+lastdigit ; 
			temp=temp/10;
		}
		System.out.println("reverse="+reverse);
	}
}
