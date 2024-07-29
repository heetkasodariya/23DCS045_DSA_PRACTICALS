
//floyedtriangle
import java.util.*;

public class p8floyedtriangle {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("ENTER VALUE : ");
      int n = in.nextInt();
      int a=1;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < i + 1; j++) {
            System.out.print(a+"  ");
            a++;
         }
         System.out.println();
      }
   }
}
