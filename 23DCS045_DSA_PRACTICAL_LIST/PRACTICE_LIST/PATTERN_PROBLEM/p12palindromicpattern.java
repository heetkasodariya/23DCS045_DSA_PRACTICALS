
//palindromicpattern
import java.util.*;

public class p12palindromicpattern {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);

      int n;
      System.out.print("\nENTER THE VALUE : ");
      n = in.nextInt();

      for (int i = 0; i < n; i++) {
         for (int j = n - 1 - i; j > 0; j--) {
            System.out.print("  ");
         }

         for (int j = i + 1; j > 0; j--) {
            System.out.print(j + " ");
         }

         for (int j = 2; j < i + 2; j++) {
            if (i == 0) {
               continue;
            } else {
               System.out.print(j + " ");
            }
         }
         System.out.print("\n");

      }

   }
}
