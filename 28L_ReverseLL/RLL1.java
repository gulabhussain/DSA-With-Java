// method 1 to reverse to a linklist

public class RLL1 {

    // Head node
    Node head;
    private int size;

    RLL1() {
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


    public void reverseList() {

        if (head == null || head.next == null) {
            return; // Empty list or single node, no need to reverse
        }

        Node prev = null;
        Node current = head.next;
        //Node next = null;

        while (current != null) {
            Node next = current.next; // Store next node
            current.next = prev; // Reverse the link

            // update prev and current for next iteration
            prev = current;      // Move prev to current
            current = next;      // Move to next node
        }

        head.next = null;
        head = prev; // Update head to the new first node
    }

    public static void main(String[] args) {

        RLL1 list = new RLL1();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.printList();

        //System.out.println("Size: " + list.getSize());

        list.reverseList();
        list.printList();
    }
}

