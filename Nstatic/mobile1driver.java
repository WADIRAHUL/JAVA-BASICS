class  mobile1driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		mobile1 a=new mobile1();
		a.company="Samsung";
		a.price=25000;
		a.ram=4;

		mobile1 a1=new mobile1();
		a1.company="Oneplus";
		a1.price=30000;
		a1.ram=8;

		mobile1 a2=new mobile1();
		a2.company="Vivo";
		a2.price=15000;
		a2.ram=6;

		a.details();
		a1.details();
		a2.details();
	}
}
