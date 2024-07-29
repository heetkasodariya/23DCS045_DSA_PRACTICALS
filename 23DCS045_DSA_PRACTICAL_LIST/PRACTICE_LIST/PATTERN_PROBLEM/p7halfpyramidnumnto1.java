
//inverted half pyramid number
import java.util.*;

public class p7halfpyramidnumnto1 {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n;
      System.out.println("ENTER VALUE : ");
      n=in.nextInt();

      for(int i=n;i>0;i--)
      {
         for(int j=1;j<i;j++)
         {
            System.out.print(j);
         }
         System.out.println();
      }
   }
}
