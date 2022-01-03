import java.util.*;
 class Prime
 {
   public static void main(String args[])
   { 
     int status=0;
     System.out.println("Enter the number: ");
     Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
   for(int i=2;i<=(n-1);i++)
{
  if(n%i==0)
  {
    status=1;
    break;
  }
 } if(status==0)
  System.out.printf("%d is a prime number\n",n);
  else
  System.out.printf("%d is not a prime number",n);
}
    
   }
