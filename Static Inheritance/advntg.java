class Bcv1 
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
}
class Bcv2 extends Bcv1
{
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
}
class advntg
{
	public static void main(String[] args)
	{
		System.out.println(Bcv1.add(10,20));
		System.out.println(Bcv1.sub(10,20));
		System.out.println(Bcv2.mul(10,20));
		System.out.println(Bcv2.div(10,20));
	}
}
