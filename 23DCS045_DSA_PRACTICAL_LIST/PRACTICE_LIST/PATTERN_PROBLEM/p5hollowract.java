
//print hollow ractangle
import java.util.*;

public class p5hollowract {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);

      int a, b;
      System.out.println("ENTER WIDTH : ");
      a = in.nextInt();
      System.out.println("ENTER HIGHT : ");
      b = in.nextInt();

      for (int i = 0; i < b; i++) {
         for (int j = 0; j < a; j++) {
            if (i == 0 || j == 0 || i == (b-1) || j == (a-1)) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }
}