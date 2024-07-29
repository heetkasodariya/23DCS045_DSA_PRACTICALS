import java.util.*;

//pyramid one side 1 to n with space left side
public class p3halfpyramid1tonwsl {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n;
      System.out.print("\nENTER HIGHT : ");
      n = in.nextInt();

      for (int i = 0; i < n; i++) {
         for (int k = n - i - 1; k > 0; k--) {
            System.out.print(" ");
         }
         for (int j = 0; j < i + 1; j++) {
            System.out.print("*");
         }
         System.out.println();
      }

   }
}