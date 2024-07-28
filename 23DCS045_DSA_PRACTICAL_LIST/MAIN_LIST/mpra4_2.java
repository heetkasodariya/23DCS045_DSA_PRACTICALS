/*PRACTICAL : 4.2
implement queue operation using circular array 
*/

import java.util.*;

public class mpra4_2 {
   static class queue {

      static int arr[];
      static int size;
      static int front = -1;
      static int rear = -1;

      queue(int size) {
         this.size = size;
         arr = new int[size];
      }

      public static boolean isEmpty() {
         return rear == -1 && front == -1;
      }

      public static boolean isFull() {
         return (rear + 1) % size == front;
      }

      public static void add(int data) {
         // if queue is full then
         if (isFull()) {
            System.out.println("QUEUE IS OVERLODED...");
            return;
         }
         // if it's the 1st element
         if (front == -1) {
            front = 0;// make front to 0
         }
         rear = (rear + 1) % size;
         arr[rear] = data;
      }

      public static int remove() {
         // if queue is empty then
         if (isEmpty()) {
            System.out.println("EMPTY QUEUE...");
            return -1;
         }
         int result = arr[front];
         //for print array element  
         arr[front]=0;
         // if only 1 element is present
         if (front == rear) {
            front = rear = -1;
         } else {
            front = (front + 1) % size;
         }
         
         return result;
      }

      

      public static void print() {
         System.out.println("\nQUEUE ELEMENTS : ");
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
         }
         System.out.println();
      }
   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);

      System.out.println("ENTER ARRAY SIZE : ");
      int n = in.nextInt();
      queue q = new queue(n);
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
         }else if (choice == 3) {
            q.print();
         }
      } while (choice != 4);

      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
      in.close();
   }
}
