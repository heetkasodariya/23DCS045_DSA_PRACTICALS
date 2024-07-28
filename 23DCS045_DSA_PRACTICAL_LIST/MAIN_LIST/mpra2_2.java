//PRACTICAL : 2 infix to postfix conversion

import java.util.*;

public class mpra2_2 {

   public static int precedence(char c) {
      if (c == '^') {
         return 3;
      } else if (c == '/' || c == '*') {
         return 2;
      } else if (c == '+' || c == '-') {
         return 1;
      }
      return -1;
   }

   public static String postfixconvert(String s) {

      Stack<Character> stack = new Stack<>();
      StringBuilder result = new StringBuilder();

      for (int i = 0; i < s.length(); i++) {
         if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
            result.append(s.charAt(i));
         } else if (s.charAt(i) == '(') {
            stack.push(s.charAt(i));
         } else if (s.charAt(i) == ')') {
            while (!stack.isEmpty() && stack.peek() != '(') {
               result.append(stack.pop());
            }
            stack.pop();
         } else {
            while (!stack.isEmpty() && precedence(s.charAt(i)) <= precedence(stack.peek())) {
               result.append(stack.pop());
            }
            stack.push(s.charAt(i));
         }
         
      }
      while (!stack.isEmpty()) {
         result.append(stack.pop());
      }
      return result.toString();
   }

   public static void main(String args[]) {
      String exp1 = "A+B*(C-D/E)^F";
      String exp2 = "((A+B)*(A/C))^(A-B/C)";
      System.out.println("POSTFIX : " + postfixconvert(exp1));
      System.out.println("POSTFIX : " + postfixconvert(exp2));
      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
   }
}
