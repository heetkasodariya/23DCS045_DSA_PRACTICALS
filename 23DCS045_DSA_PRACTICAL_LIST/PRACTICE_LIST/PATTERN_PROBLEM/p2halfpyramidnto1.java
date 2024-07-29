import java.util.*;

//pyramid one side n to 1 without space
public class p2halfpyramidnto1 {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n;
      System.out.print("\nENTER HIGHT : ");
      n = in.nextInt();

      for (int i = n; i > 0; i--) {
         for (int j = i; j > 0; j--) {
            System.out.print("* ");
         }
         System.out.println();
      }

   }
}
