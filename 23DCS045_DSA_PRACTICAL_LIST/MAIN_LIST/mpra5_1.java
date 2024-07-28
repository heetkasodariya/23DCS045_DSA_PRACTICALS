/*PRACTICAL : 
linked list operation :
(a) Insert a node at front 
(b) Insert a node at end 
(c) Insert a node after given node information 
(d) Delete a node at front 
(e) Delete a node at last
*/

import java.util.*;

public class mpra5_1 {
   static class node {
      int data;
      node next;

      node(int data) {
         this.data = data;
         next = null;
      }
   }

   static node head;

   public static void insertatfront(int data) {
      node newnode = new node(data);
      if (head == null) {
         head = newnode;
         return;
      }
      newnode.next = head;
      head = newnode;

      System.out.println("NODE " + data + " INSERTED AT FRONT");
   }

   public static void insertrear(int data) {
      node newnode = new node(data);
      node curnode = head;
      if (head == null) {
         head = newnode;
         return;
      }
      while (curnode.next!= null) {
         curnode = curnode.next;
      }
      curnode.next = newnode;
      System.out.println("NODE " + data + " INSERTED AT REAR");
   }

   public static void insertafter(int data, int gdata) {
      node newnode = new node(data);
      node curnode = head;
      if (curnode == null) {
         System.out.println("GIVENDATA IS NOT FOUND..");
         return;
      }
      while (curnode != null && curnode.data != gdata) {
         curnode = curnode.next;
      }
      newnode.next = curnode.next;
      curnode.next = newnode;

      System.out.println("NODE " + data + " INSERTED AFTER " + gdata);
   }

   public static void deletefront() {
      if (head == null) {
         System.out.println("LIST IS EMPTY");
         return;
      } else if (head.next == null) {
         head = null;
         System.out.println("NODE DELETED AT FRONT[FIRST ELEMENT]");
         return;
      } else {
         head = head.next;
         System.out.println("NODE DELETED AT FRONT");
      }
   }

   public static void deleterear() {
      if (head == null) {
         System.out.println("LIST IS EMPTY");
         return;
      } else if (head.next == null) {
         head = null;
         System.out.println("NODE DELETED AT REAR [FIRST ELEMENT]");
         return;
      } else {
         node curnode = head;
         while (curnode.next.next != null) {
            curnode = curnode.next;
         }
         curnode.next = null;

         System.out.println("NODE DELETED AT REAR");
      }
   }

   public static void printlist()
   {
      node temp = head;
      System.out.print("LINKED LIST : ");
      while (temp!= null) {
         System.out.print(temp.data + "-->");
         temp = temp.next;
      }
      System.out.println("NULL");
   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int choice, data, gdata;
      do{
         System.out.println("\nLINKED LIST OPERATIONS");
         System.out.println("1. INSERT AT FRONT");
         System.out.println("2. INSERT AT REAR");
         System.out.println("3. INSERT AFTER GIVEN DATA");
         System.out.println("4. DELETE AT FRONT");
         System.out.println("5. DELETE AT REAR");
         System.out.println("6. PRINT LIST");
         System.out.println("7. EXIT");
         System.out.print("ENTER YOUR CHOICE : ");
         choice = in.nextInt();

         if(choice==1)
         {
            System.out.print("ENTER DATA : ");
            data = in.nextInt();
            insertatfront(data);
            printlist();
         }
         else if(choice==2)
         {
            System.out.print("ENTER DATA : ");
            data = in.nextInt();
            insertrear(data);
            printlist();
         }
         else if(choice==3)
         {
            System.out.print("ENTER DATA : ");
            data = in.nextInt();
            System.out.print("ENTER GIVEN DATA : ");
            gdata = in.nextInt();
            insertafter(data, gdata);
            printlist();
         }
         else if(choice==4)
         {
            deletefront();
            printlist();
         }
         else if(choice==5)
         {
            deleterear();
            printlist();
         }
         else if(choice==6)
         {
            printlist();
         }
      }while(choice!=7);

      System.out.println("\nBY 23DCS045 HEET_KASODARIYA");
      in.close();
   }
}
