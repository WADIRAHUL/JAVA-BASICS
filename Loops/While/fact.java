class fact 
{
	public static void main(String[] args) 
	{
		int fact=1,num=5;
		while(num>1)
		{
			fact=fact*num--;
		}
		System.out.println("the fact is "+fact);
	}
}
