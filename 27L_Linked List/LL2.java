import java.util.*;
public class LL2 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(1);
        list.addFirst(2);
        System.err.println("After adding elements at the beginning: " + list);
        
        list.addFirst(3);
        list.addLast(4);
        System.err.println("After adding elements at the end: " + list);

        System.err.println("Size of the linked list: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.err.println("Element at index " + i + ": " + list.get(i));
        }

        // for the searching
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 3){
                System.err.println("Element '3' found at index: " + i);
            }
        }
        System.out.println("null");

        // delete first 
        list.removeFirst();
        System.err.println("After deleting first element: " + list);

        // delete last
        list.removeLast();  
        System.out.println("After deleting last element: " + list);

        // remove in list
        // list.remove(3)

    }
}














// public class LL2 {

//     // Head node
//     Node head;
//     private int size;

//     LL2() {
//         this.size = 0;
//     }


//     // Node class
//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
           
//         }
//     }


//     // Add element at the beginning
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//          this.size++;

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // Add element at the end
//     public void addLast(String data) {
//         Node newNode = new Node(data);
//         this.size++;
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node current = head;

//         while (current.next != null) {
//             current = current.next;
//         }

//         current.next = newNode;
//     }

//     // Print Linked List
//     public void printList() {
//         if (head == null) {
//             System.out.println("Linked List is empty");
//             return;
//         }

//         Node current = head;

//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }

//         System.out.println("NULL");
//     }

//     // delete first element
//     public void deleteFirst() {
//         if (head == null) {
//             System.out.println("Linked List is empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }

//     // delete last element
//     public void deleteLast() {
//         if (head == null) {
//             System.out.println("Linked List is empty");
//             return;
//         }
//         size--;
//         if (head.next == null) {
//             head = null;
//             return;
//         }

//         Node SecondLast = head;
//         Node LastNode = head.next;
//         while (LastNode.next != null) {
//             LastNode = LastNode.next;
//             SecondLast = SecondLast.next;
//         }
//         SecondLast.next = null;
//     }

//     public int getSize() {
//         return size;
//     }