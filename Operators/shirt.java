class shirt 
{
	public static void main(String[] args) 
	{
		String c1="Black",c2="White",c3="Blue",size="L";
		int price=2000;
		//Test cases
		String color="Black";
		String asize="L";
		int aprice=1999;

		String msg1=("T shirt is selected");
		String msg2=("T shirt is not selected");

		String result=(color==c1||color==c2||color==c3)&&asize==size && aprice<=price ? msg1 : msg2 ;
		System.out.println(result);
	}
}
