/*PRACTICAL : 4.1
implement queue operation using array 
*/

import java.util.*;

public class mpra4_1 {
   // make a class static queue

   static class Queue {
      static int arr[];
      static int size;
      static int rear;// we have one direction operation then we use only rear, not use front

      Queue(int size) {
         this.size = size;
         arr = new int[size];
         rear = -1;
      }

      public static boolean isEmpty() {
         return rear == -1;
      }

      public static boolean isFull() {
         return rear == size - 1;
      }

      public static void add(int data) {
         if (isFull()) {
            System.out.println("QUEUE IS OVERFLOW ");
            return;
         }
         rear = rear + 1;
         arr[rear] = data;
      }

      // O(n) complexity because we use one for loop for transfer data
      public static int remove() {
         if (isEmpty()) {
            System.out.println("EMPTY QUEUE");
            return -1;
         }

         int front = arr[0];

         for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
         }
         rear--;
         return front;
      }

      public static void print() {
         System.out.println("\nQUEUE ELEMENTS : ");
         for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + "|");
         }
         System.out.println();
      }
   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);

      System.out.println("ENTER ARRAY SIZE : ");
      int n = in.nextInt();
      Queue q = new Queue(n);
      int choice = 4;

      do {
         System.out.println("\n1. ENQUEUE \n2. DEQUEUE \n3. DISPLAY \n4. EXIT ");
         System.out.println("ENTER CORRECT OPERATION NUMBER : ");
         choice = in.nextInt();

         if (choice == 1) {
            System.out.println("\nENTER DATA WHICH ADD IN QUEUE : ");
            int data = in.nextInt();
            q.add(data);
            q.print();
         } else if (choice == 2) {
            System.out.println("\nREMOVED DATA : " + q.remove());
            q.print();
         } else if (choice == 3) {
            q.print();
         }
      } while (choice != 4);

      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
      in.close();
   }
}
