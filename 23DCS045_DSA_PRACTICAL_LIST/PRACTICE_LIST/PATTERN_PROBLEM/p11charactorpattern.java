//charactorpattern
import java.util.*;

public class p11charactorpattern
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);

      int n;
      System.out.print("\nENTER THE VALUE : ");
      n=in.nextInt();
      char c='A';

      for(int i=0;i<n;i++)
      {
         for(int j=n-1-i;j>0;j--)
         {
            System.out.print(" ");
         }

         for(int j=0;j<i+1;j++)
         {
            System.out.print(c + " ");
            c++;
         }

         System.out.print("\n");

      }
      
   }
}
