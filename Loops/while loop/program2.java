class program2
{
	public static void main(String[] args) 
	{
		int amount=8000;
		int minbal=5000;
		int withdrawamnt=2000;
		int remainingamnt;
        if(withdrawamnt<minbal)		
	{	
			remainingamnt=amount-withdrawamnt;
	   System.out.println("sucess");
	   System.out.print("remaining amnt is"+remainingamnt);
  }
else
		{
	System.out.print("insufficient balance");
		}
	}
}