class  Upper
{
	public static void main(String[] args)
	{

	String s1="java";
	char[] charr=s1.toCharArray();
	for(int i=0;i<charr.length;i++)
    {
		int x =charr[i];
		char c=(char)(x-32);
	
	
		System.out.println(c);
	
   }
}
}