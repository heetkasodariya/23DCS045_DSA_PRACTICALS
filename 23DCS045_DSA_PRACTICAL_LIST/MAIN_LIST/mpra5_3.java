/*PRACTICAL : 
Implement following operations of circular singly linked list. 
(a) Inserting a node at front 
(b) Delete a node at end
*/

import java.util.*;

public class mpra5_3 {
   static class node {
      int data;
      node next;

      node(int data) {
         this.data = data;
         next = null;
      }
   }

   static node head = null;
   static int size = 0;

   static void insertAtFront(int data) {
      node newNode = new node(data);
      if (head == null) {
         head = newNode;
         head.next = head;
      } else {
         newNode.next = head;
         node temp = head;
         while (temp.next != head) {
            temp = temp.next;
         }
         temp.next = newNode;
         head = newNode;
      }
      size++;
   }

   static void deleteAtEnd() {
      if (head == null) {
         System.out.println("LIST IS EMPTY");
         return;
      }
      if (head.next == head) {
         head = null;
         size = 0;
      } else {
         node temp = head;
         while (temp.next.next != head) {
            temp = temp.next;
         }
         temp.next = head;
         head = temp.next;
         size--;
      }
   }

   static void display() {
      if (head == null) {
         System.out.println("LIST IS EMPTY");
         return;
      }
      node temp = head;
      int front=head.data;
      System.out.print("-->");
      do {
         System.out.print(temp.data + "->");
         temp = temp.next;
      } while (temp != head);
      System.out.println(front);
   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int choice;
      do {
         System.out.println("1. ENTER DATA AT FRONT ");
         System.out.println("2. DELETE AT END ");
         System.out.println("3. EXIT");
         System.out.println("ENTER YOUR CHOICE : ");
         choice = in.nextInt();
         if (choice == 1) {
            System.out.print("ENTER DATA : ");
            int data = in.nextInt();
            insertAtFront(data);
            display();
         } else if (choice == 2) {
            deleteAtEnd();
            display();
         }
      } while (choice != 3);
      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
      in.close();
   }
}
