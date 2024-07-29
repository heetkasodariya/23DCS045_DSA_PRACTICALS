
//p13butterflypattern
import java.util.*;

public class p13butterflypattern {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n;
      System.out.print("\nENTER N : ");
      n = in.nextInt();

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < i + 1; j++) {
            System.out.print("* ");
         }
         for (int k = (2 * n - 2 - (2 * i)); k > 0; k--) {
            System.out.print("  ");
         }
         for (int j = 0; j < i + 1; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
      for (int i = n; i >0; i--) {
         for (int j = i; j>0; j--) {
            System.out.print("* ");
         }
         for (int k = ((2 * n)  - (2 * i)); k > 0; k--) {
            System.out.print("  ");
         }
         for (int j = i; j>0; j--) {
            System.out.print("* ");
         }
         System.out.println();
      }

   }
}
