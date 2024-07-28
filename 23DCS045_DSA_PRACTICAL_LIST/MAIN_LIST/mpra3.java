//PRACTICAL : 3

import java.util.*;

public class mpra3 {

   public static void towerofhanoi(int n, String source, String helper, String destination) {
      if(n==1)
      {
         System.out.println("Moving ring 1 from " + source + " to " + destination);
         return;
      }
      towerofhanoi(n-1, source, destination,helper);
      System.out.println("Moving ring " + n + " from " + source + " to " + destination);
      towerofhanoi(n-1, helper, source, destination);

   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);

      System.out.println("ENTER DISK NUMBER : ");
      int n=in.nextInt();

      towerofhanoi(n, "Tower A", "Tower B", "Tower C");

      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
      in.close();
   }
}
