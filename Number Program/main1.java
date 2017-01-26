import java.util.Scanner;
class main1
{
  static int fact(int n)
   {
      int f=1;
      while(n>0)
      {
        f=f*n;
        n--;
         }
       return f;
     }
     static boolean isStrong(int n);
      {
           int t=n;
           int sum=0;
      while(n>0)
     {
     int r=n%10;
     sum=sum+fact(r);
     n=n/10;
     }
     return t=sum;
   /* if(t==sum)
       true;
     else
      false;*/
      return t=sum;
      }

 public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   int num=sc.nextInt();
   boolean res=isStrong(num);
   //if(res==true)
   if(res)
    System.out.println("strong number");
   else
    System.out.println(" not a strong number");
  }
}