class  emp_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		emp a=new emp();
		a.name="Rahul";
		a.mobile=9874560;
		a.age=25;

		emp a1=new emp();
		a1.name="Rakesh";
		a1.mobile=9876543;
		a1.age=26;
		System.out.println("Emp name: "+a.name);
		System.out.println("Emp mobile: "+a.mobile);
		System.out.println("Emp age: "+a.age);
		System.out.println("Emp name: "+a1.name);
		System.out.println("Emp mobile: "+a1.mobile);
		System.out.println("Emp age: "+a1.age);
	}
}
