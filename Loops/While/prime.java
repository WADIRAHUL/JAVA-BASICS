class prime 
{
	public static void main(String[] args) 
	{
		int num=11,a=2;
		int count=0;
		while (a<num)
		{
			if (num%a==0)
			{
				count++;
				break;
			}
		a++;
		}
		if (count==0)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}
}
