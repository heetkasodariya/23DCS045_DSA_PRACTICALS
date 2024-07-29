import java.util.*;

//pyramid one side n to 1 with space
public class p4halfpyramidnto1wsls {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n;
      System.out.print("\nENTER HIGHT : ");
      n = in.nextInt();

      for (int i = n; i >0; i--) {
         for(int k=n-i;k>0;k--)
         {
            System.out.print(" ");
         }
         for (int j = i; j > 0; j--) {
            System.out.print("*");
         }
         System.out.println();
      }

   }
}