class bank
{
   int account_num;
   String name;
   String type;
   String branch;
   String Bname;
   int x ,y,p,q;
   void display()
    {
	System.out.println("bank account num is "+account_num);
	System.out.println("bank account holder name is "+name);
	System.out.println("bank account type is "+type);
	System.out.println("bank account branch is "+branch);
	System.out.println("bank name is "+Bname);
	
     }
    void withdraw()
   {
     System.out.println("withdrwal ammount is "+x);
     System.out.println("account balance is "+y);
   } 
  
    void deposit()
   {
     System.out.println("deposited ammount is "+p);
     System.out.println("account balance is "+q);
   } 
 }  

  class main6
 {
  public static void main(String[] args)
   {
    bank b1=new bank();
    b1.account_num=77241;
    b1.name="salman";
    b1.type="SB";
    b1.Bname="SBM";
    b1.branch="hiriyur";
    b1.display();
    b1.deposit();
    b1.p=5000;
    b1.q=4000;
    b1.withdraw();
    b1.x=6000;
    b1.y=4000;
}
}
