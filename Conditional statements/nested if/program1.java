class program1 
{
	public static void main(String[] args) 
	{
		int PIN=1234;
	double balance=25000.65;
	double amount=100050;
		if(PIN==1234)
			{
		if(amount<=balance)
				{
			balance=balance-amount;
			System.out.println("success");
	System.out.println("current balance is"+balance);
				}
				else
				{
					System.out.println("in sufficient balance");
				}
			}
			else
		{
				System.out.println("Invalid PIN");
		}
	}
}