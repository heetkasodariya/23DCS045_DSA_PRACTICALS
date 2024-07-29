//string operation in java 

import java.util.*;

public class P_STRING {
   public static void ckpalindromstr(String str) {
      int len = str.length();
      int ck = 0;

      for (int i = 0; i < len / 2; i++) {
         if (str.charAt(i) == str.charAt(len - 1 - i)) {
            ck = 1;
         } else {
            ck = 0;
            break;
         }
      }

      if (ck == 1) {
         System.out.println("STRING IS PELINDROM.");
      } else {
         System.out.println("STRING IS NOT PELINDROM.");
      }
   }

   public static void strcompress(String str) {
      String st = "";
      for (int i = 0; i < str.length(); i++) {

         Integer count = 1;

         while ( i < (str.length() - 1) && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
         }

         st += str.charAt(i);
         if (count > 1) {
            st += count.toString();
         }

      }

      System.out.println("STRING IN COMPRESS : " + st);
   }

   public static void uppercase(String str) {

      // inbuilt fun : ch.Touppercase()
      StringBuilder st = new StringBuilder("");
      // String nstr;
      for (int i = 0; i < str.length(); i++) {
         st.append((char) (str.charAt(i) - 32));
      }

      System.out.println("STRING IN UPPERCASE : " + st);
   }

   public static void distance(String rt) {

      int l = rt.length();
      int x = 0, y = 0;
      for (int i = 0; i < l; i++) {
         if (rt.charAt(i) == 'W') {
            x--;
         } else if (rt.charAt(i) == 'S') {
            y--;
         } else if (rt.charAt(i) == 'N') {
            y++;
         } else if (rt.charAt(i) == 'E') {
            x++;
         }
      }

      System.out.println("\nAFTER DRIVING ROOT , POSITION IS (" + x + "," + y + ")");
      System.out.print("\nSHORTEST DISTANCE IS \n(NON-LENEAR) : " +
            Math.sqrt((x * x) + (y * y)) + "\n(LENEAR) : " + (x + y));

      System.out.print("\nROOT DIRECTION IS : \n");
      for (int i = 0; i < x; i++) {
         System.out.print("E ");
      }
      for (int i = 0; i < y; i++) {
         System.out.print("N ");
      }

   }

   public static void substring(String str, int l) {
      int len = str.length();
      for (int i = 0; i <= len - l; i++) {
         for (int j = i; j < l + i; j++) {
            System.out.print(str.charAt(j));
         }
         System.out.println();
      }

   }

   public static void substringat(String str, int s, int l) {

      String substr = "";
      for (int i = s; i < l; i++) {
         substr += str.charAt(i);
      }

      System.out.println("SUBSTRING AT " + s + " TO " + l + " IS : " + substr);

   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);

      // make charactor array or string
      char arr[] = { 'h', 'e', 'e', 't' };

      String str = "aabbbbcccdeee";

      // String str1 = new String("hkpatel");

      // System.err.println(arr);
      // System.err.println(str);
      // System.err.println(str1);

      // System.err.println(str.length());// 4

      // String are imutable (no change)

      // System.err.println("\nENTER YOUR NAME : ");
      // String name = in.next();// ONLY READ SINGLE WORD
      // System.err.println(name);
      // System.err.println(name.length());

      // System.err.println("\nENTER YOUR NAME : ");
      // String fname;
      // fname = in.nextLine();
      // System.err.println(fname);

      // //array element of string = charAt(i)

      // System.out.print(fname.charAt(7));

      // ckpalindromstr(name);
      // distance(str);
      // System.out.print("SUBSTRING OF " + str + " ARE : \n");
      // substring(str,4);
      // substringat(str, 0, 5);
      // own substring function : substring(start,end)
      // System.out.print(str.substring(0,5));
      // compare of 2 string str.compareTo(str2);
      // 0 : equal , <0 : str<str2 , >0 : str>str2

      // uppercase(str);
      strcompress(str);

   }
}
