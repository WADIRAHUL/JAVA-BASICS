import java.util.Scanner;
class A5 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		double [] a=new double[size];
		//To store the elements of Array
		System.out.println("Enter the value of array");
		for (int i=0;i<size ;i++ )
		{
			a[i]=s.nextDouble();
		}
		//To Print the elements of Array
		System.out.println("The elements of array are: ");
		for (int i=0;i<size ;i++ )
		{
			System.out.println(a[i]);
		}
	}
}
