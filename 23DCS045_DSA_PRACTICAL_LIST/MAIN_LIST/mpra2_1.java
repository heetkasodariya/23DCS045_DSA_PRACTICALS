//PRACTICAL : 1 simple method

import java.util.*;

public class mpra2_1 {
   public static int top = -1;

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = 0;
      System.out.println("ENTER YOUR SENTENCE : ");

      String sentence = in.nextLine();
      String arr[] = new String[sentence.length()];

      for (int i = 0; i < sentence.length(); i++) {
         top++;
         arr[top] = sentence.substring(i, i + 1);
      }

      do {
         System.out.println("1. UNDO ");
         System.out.println("2. REDO");
         System.out.println("3. DISPLAY");
         System.out.println("0. EXIT");
         System.out.print("\nENTER OPERATION NUMBER: ");
         n = in.nextInt();

         if (n == 1) {
            if (top >= 0) {
               top--;
               for (int i = 0; i <= top; i++) {
                  System.out.print(arr[i]);
               }
               System.out.println();
            } else {
               System.out.println("NO STRINGS TO UNDO...");
            }
         } else if (n == 2) {
            if (top < arr.length) {
               top++;
               for (int i = 0; i <= top; i++) {
                  System.out.print(arr[i]);
               }
               System.out.println();
            } else {
               System.out.println("NO STRINGS TO REDO...");
            }

         } else if (n == 3) {
            if (top >= 0) {
               for (int i = 0; i <= top; i++) {
                  System.out.print(arr[i]);
               }
               System.out.println();
            } else {
               System.out.println("NO STRINGS TO DISPLAY...");
            }
         } else {
            System.out.println("INVALID INPUT..");
         }
      } while (n != 0);

      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
      in.close();
   }
}
