
//pattern -  : solid ractagle
import java.util.*;

public class p0solidract {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n, m;
      System.out.print("\nENTER WIDTH : ");
      n = in.nextInt();
      System.out.print("\nENTER HIGHT : ");
      m = in.nextInt();

      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}