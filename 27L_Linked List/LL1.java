
public class LL1 {

    // Head node
    Node head;
    private int size;

    LL1() {
        this.size = 0;
    }


    // Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
           
        }
    }


    // Add element at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
         this.size++;

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add element at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        this.size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Print Linked List
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    // delete first element
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last element
    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node SecondLast = head;
        Node LastNode = head.next;
        while (LastNode.next != null) {
            LastNode = LastNode.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        LL1 list = new LL1();

        list.addFirst("A");
        list.addFirst("is");
        list.printList();

        list.addLast("List");   
        list.printList();

        list.addFirst("this");   
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size of the linked list: " + list.getSize());

        list.addFirst("This");
        System.out.println("Size of the linked list: " + list.getSize());
    }
}



// add list


// public class LL1 {

//     // Node class
//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Head node
//     Node head;

//     // Add element at the beginning
//     public void addFirst(String data) {
//         Node newNode = new Node(data);

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
    
//     public static void main(String[] args) {

//         LL1 list = new LL1();

//         list.addFirst("A");
//         list.addFirst("is");
//         list.printList();

//         list.addLast("List");   
//         list.printList();

//         list.addFirst("this");   
//         list.printList();

    
//     }
// }

