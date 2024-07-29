//half pyramid with number 
import java.util.*;

public class p6halfpyramidnum1ton
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int n;
      System.out.println("ENTER VALUE : ");
      n=in.nextInt();

      for(int i=0;i<n;i++)
      {
         for(int j=0;j<i+1;j++)
         {
            System.out.print(j+1);
         }
         System.out.println();
      }
   }
}
