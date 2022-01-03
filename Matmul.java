import java.util.*;
 class Matmul
 {
   public static void main(String args[])
   { 
   int i,j,m,n,p,q, k;
   
Scanner obj=new Scanner(System.in);
 System.out.print("ENTER THE ROWS & COLUMN of matrix1:");
  m=obj.nextInt();
  n=obj.nextInt();
  System.out.print("ENTER THE ROWS & COLUMN of matrix2:");
  p=obj.nextInt();
  q=obj.nextInt();
  int a[][]=new int[m][n];
  int b[][]=new int[p][q];
  int c[][]=new int[m][q];
  if(n==p)
  {
      System.out.println("Enter the elements  matrix1:");
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j]=obj.nextInt();
      }
    }
    System.out.println("Enter the elements  matrix2:");
    for(i=0;i<p;i++)
    {
      for(j=0;j<q;j++)
      {
        b[i][j]=obj.nextInt();
      }
    }
    System. out.println("Multiplication of matrix1 &matrix2");
   for(i=0;i<m;i++)
    {
      for(j=0;j<q;j++)
      {
        c[i][j]=0;
        for(k=0;k<p;k++)
        c[i][j]=c[i][j]+a[i][k]*b[k][j];
      }
    }
    for(i=0;i<m;i++)
    {
      for(j=0;j<q;j++)
      {
      System.out.printf("%d  ", c[i][j]) ;
      }
      System.out.print("\n") ;
    }
  }
  else
 System.out.print("MULTIPLICATION NOT POSSIBLE.... ") ;
  
   }
 }
