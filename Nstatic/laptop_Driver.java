class  laptop_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		laptop a=new laptop();
		a.company="Dell";
		a.price=25000;
		a.ram=4;

		laptop a1=new laptop();
		a1.company="HP";
		a1.price=55000;
		a1.ram=8;
		System.out.println("Laptop company: "+a.company);
		System.out.println("Laptop price: "+a.price);
		System.out.println("Laptop Ram: "+a.ram);
		System.out.println("Laptop company: "+a1.company);
		System.out.println("Laptop price: "+a1.price);
		System.out.println("Laptop Ram: "+a1.ram);
	}
}
