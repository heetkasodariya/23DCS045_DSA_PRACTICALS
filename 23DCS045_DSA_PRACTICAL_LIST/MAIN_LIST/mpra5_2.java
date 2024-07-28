/*PRACTICAL : doublyb linkedlist function practical
Implement following operations of doubly linked list. 
(a) Insert a node at front 
(b) Insert a node at end 
(c) Insert a node after given node information 
(d) Delete a node at front 
(e) Count number of nodes 
*/

import java.util.Scanner;

public class mpra5_2 {
   static int size;
   static node head;

   static class node {
      int data;
      node prev, next;

      node(int data) {
         this.data = data;
         prev = next = null;
         size++;
      }
   }

   public static void insertatfront(int data) {
      node newnode = new node(data);
      if (head == null) {
         head = newnode;
         return;
      }
      newnode.next = head;
      head.prev = newnode;
      head = newnode;
      System.out.println("NODE " + data + " INSERTED AT FRONT");
   }

   public static void insertatend(int data) {
      node newnode = new node(data);
      if (head == null) {
         head = newnode;
         return;
      }
      node temp = head;
      while (temp.next != null) {
         temp = temp.next;
      }
      temp.next = newnode;
      newnode.prev = temp;
      System.out.println("NODE " + data + " INSERTED AT END");
   }

   public static void insertafterdata(int data, int give) {
      if (head == null) {
         System.out.println("LIST IS EMPTY..");
         return;
      }
      node temp = head;
      while (temp != null && temp.data != give) {
         temp = temp.next;
      }
      if (temp == null) {
         System.out.println("GIVEN DATA IS NOT FOUND..");
         return;
      }
      node newnode = new node(data);
      newnode.next = temp.next;
      if (temp.next != null) {
         temp.next.prev = newnode;
      }
      temp.next = newnode;
      newnode.prev = temp;
      System.out.println("NODE " + data + " INSERTED AFTER " + give);
   }

   public static void deleteatfront() {
      if (head == null) {
         System.out.println("LIST IS EMPTY");
         return;
      }
      System.out.println("NODE " + head.data + " IS DELETED AT FRONT");
      head = head.next;
      if (head != null) {
         head.prev = null;
      }
      size--;
   }

   public static void deleteatrear() {
      if (head == null) {
         System.out.println("LIST IS EMPTY");
         return;
      }
      if (head.next == null) {
         System.out.println("NODE " + head.data + " IS DELETED AT REAR [FIRST ELEMENT]");
         head = null;
         size--;
         return;
      }
      node temp = head;
      while (temp.next.next != null) {
         temp = temp.next;
      }
      System.out.println("NODE " + temp.next.data + " IS DELETED AT REAR");
      temp.next = null;
      size--;
   }

   public static void display() {
      if (head == null) {
         System.out.println("LIST IS EMPTY");
         return;
      }
      node temp = head;
      System.out.print("null<->");
      while (temp != null) {
         System.out.print(temp.data + "<->");
         temp = temp.next;
      }
      System.out.print("null\n");
   }

   public static int countnode() {
      return size;
   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int choice;
      do {
         System.out.println("\n1. INSERT AT FRONT");
         System.out.println("2. INSERT AT END");
         System.out.println("3. INSERT AFTER GIVEN DATA");
         System.out.println("4. DELETE AT FRONT");
         System.out.println("5. DELETE AT REAR");
         System.out.println("6. COUNT NUMBER OF NODES");
         System.out.println("7. DISPLAY");
         System.out.println("8. EXIT");
         System.out.print("ENTER YOUR CHOICE : ");
         choice = in.nextInt();
         if (choice == 1) {
            System.out.print("ENTER DATA : ");
            int data = in.nextInt();
            insertatfront(data);
            display();
         } else if (choice == 2) {
            System.out.print("ENTER DATA : ");
            int data = in.nextInt();
            insertatend(data);
            display();
         } else if (choice == 3) {
            System.out.print("ENTER DATA : ");
            int data = in.nextInt();
            System.out.print("ENTER GIVEN DATA : ");
            int give = in.nextInt();
            insertafterdata(data, give);
            display();
         } else if (choice == 4) {
            deleteatfront();
            display();
         } else if (choice == 5) {
            deleteatrear();
            display();
         } else if (choice == 6) {
            System.out.println("NUMBER OF NODES : " + countnode());
         } else if (choice == 7) {
            display();
         }
      } while (choice != 8);

      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
      in.close();
   }
}