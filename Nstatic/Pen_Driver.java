class  Pen_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		Pen a=new Pen();
		a.id=1;
		a.color="Black";
		a.price=10;

		Pen a1=new Pen();
		a1.id=2;
		a1.color="Red";
		a1.price=10;
		System.out.println("Pen id: "+a.id);
		System.out.println("Pen color: "+a.color);
		System.out.println("Pen price: "+a.price);
		System.out.println("Pen id: "+a1.id);
		System.out.println("Pen color: "+a1.color);
		System.out.println("Pen price: "+a1.price);
	}
}
