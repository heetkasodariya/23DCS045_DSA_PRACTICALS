
//p9num01tri
import java.util.*;

public class p9num01tri {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("ENTER VALUE : ");
      int n = in.nextInt();
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < i + 1; j++) {
            if((i+j)%2==0)
            {
               System.out.print(1);
            }
            else{
               System.out.print(0);
            }
         }
         System.out.println();
      }
   }
}
