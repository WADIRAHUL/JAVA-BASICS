class  mobile_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		mobile a=new mobile();
		a.company="Samsung";
		a.price=25000;
		a.ram=4;

		mobile a1=new mobile();
		a1.company="Oneplus";
		a1.price=30000;
		a1.ram=8;
		System.out.println("Mobile Company: "+a.company);
		System.out.println("Mobile price: "+a.price);
		System.out.println("Mobile ram: "+a.ram);
		System.out.println("Mobile Company: "+a1.company);
		System.out.println("Mobile price: "+a1.price);
		System.out.println("Mobile ram: "+a1.ram);
	}
}
