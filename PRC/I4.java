interface A
{
	public static void test();
	/*{
		System.out.println("From Test");
	}*/
} 


interface I4 extends A
{
	public static void main(String[] args) 
	{
		public static void test()
		{
			System.out.println("From Test");
		}
	}
}




