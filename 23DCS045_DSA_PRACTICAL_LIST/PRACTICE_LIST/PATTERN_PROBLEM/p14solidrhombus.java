//p14solidrhombus
import java.util.*;

public class p14solidrhombus
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);

      System.out.print("\nSOLID RHOMBUS ");
      System.out.print("\nENTER N : ");
      int n=in.nextInt();
      System.out.print("\nENTER LINE : ");
      int l=in.nextInt();

      for(int i=0;i<n;i++)
      {
         for(int j=n-1-i;j>0;j--)
         {
            System.out.print("  ");
         }

         for(int j=0;j<l;j++)
         {

            System.out.print("* ");
         }

         System.out.print("\n");
      }

      System.out.print("\nSPACE RHOMBUS ");

      System.out.print("\nENTER N : ");
      n=in.nextInt();
      System.out.print("\nENTER LINE : ");
      l=in.nextInt();

      for(int i=0;i<n;i++)
      {
         for(int j=n-1-i;j>0;j--)
         {
            System.out.print("  ");
         }

         for(int j=0;j<l;j++)
         {
            if(i==0 || j==0 || i==n-1 || j==l-1)
            {
               System.out.print("* ");
            }
            else{
               System.out.print("  ");
            }
            
         }

         System.out.print("\n");
      }
   }
}
