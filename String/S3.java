class  S3
{
	public static void main(String[] args) 
	{
		String s="Happy New Year";
		char[] ch=new char[s.length()];
		for (int i=0;i<ch.length ;i++ )
		{
			ch[i]=s.charAt(i);
			System.out.println(ch[i]);
		}
	}
}
