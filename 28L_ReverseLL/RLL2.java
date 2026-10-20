// reverse a linked list using recursion
public class RLL2 {

    // Head node
    Node head;
    private int size;

    RLL2() {
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

    // Add element at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;

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

    // Get size
    public int getSize() {
        return size;
    }


    public Node reverseListRecursively(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    
    public static void main(String[] args) {

        RLL2 list = new RLL2();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.printList();

        //System.out.println("Size: " + list.getSize());

        list.head = list.reverseListRecursively(list.head);
        list.printList();
    }
}

