import java.util.Arrays;

class Driver2
{
	public static void main(String[] args)
	{
		//to store 5 Laptop details
		Laptop[] l=new Laptop[5];
		l[0]=new Laptop(5,"Dell",30000);
		l[1]=new Laptop(3,"HP",25000);
		l[2]=new Laptop(4,"Asus",35000);
		l[3]=new Laptop(1,"Realme",28000);
		l[4]=new Laptop(2,"Iphone",47000);
		System.out.println("Before Sorting");
		for (int i=0;i<l.length ;i++ )
		{
			System.out.println(l[i]);
		}
		Arrays.sort(l);
		System.out.println("After Sorting");
		for (int i=0;i<l.length ;i++ )
		{
			System.out.println(l[i]);
		}
	}
}