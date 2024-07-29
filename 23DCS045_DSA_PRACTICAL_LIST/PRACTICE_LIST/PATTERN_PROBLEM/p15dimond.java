
//p15dimond
import java.util.*;

public class p15dimond {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.print("\nENTER N : ");
      int n = in.nextInt();

      for (int i = 0; i < n; i++) {
         for (int j = n - 1 - i; j > 0; j--) {
            System.out.print(" ");
         }
         for (int j = 0; j < (2 * i + 1); j++) {
            System.out.print("*");
         }

         System.out.print("\n");
      }

      for (int i = n; i > 0; i--) {
         for (int j = 0; j < n - i; j++) {
            if (i == n) {
               continue;
            } else {
               System.out.print(" ");
            }
         }
         for (int j = 2 * i - 1; j > 0; j--) {
            System.out.print("*");
         }

         System.out.print("\n");
      }
   }
}
