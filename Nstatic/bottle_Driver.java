class  bottle_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		bottle a=new bottle();
		a.color="Pink";
		a.shape="Circle";
		a.price=50;

		bottle a1=new bottle();
		a1.color="Blue";
		a1.shape="Rectangle";
		a1.price=50;
		System.out.println("Bottle color: "+a.color);
		System.out.println("Bottle shape: "+a.shape);
		System.out.println("Bottle price: "+a.price);
		System.out.println("Bottle color: "+a1.color);
		System.out.println("Bottle shape: "+a1.shape);
		System.out.println("Bottle price: "+a1.price);
	}
}
