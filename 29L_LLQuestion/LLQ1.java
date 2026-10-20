
// Find and remove the nth node from the end of a linked list

public class LLQ1 {

    // Node class
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the end
    public static ListNode addLast(ListNode head, int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            return newNode;
        }

        ListNode curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    // Remove nth node from the end
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || n <= 0) {
            return head;
        }

        // Calculate the size
        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        // Invalid n
        if (n > size) {
            return head;
        }

        // Remove the first node
        if (n == size) {
            return head.next;
        }

        // Find the previous node
        int indexToSearch = size - n;

        ListNode prev = head;
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        return head;
    }

    public static void main(String[] args) {

        ListNode head = null;

        // Create linked list
        head = addLast(head, 1);
        head = addLast(head, 2);
        head = addLast(head, 3);
        head = addLast(head, 4);
        head = addLast(head, 5);

        System.out.println("Original Linked List:");
        printList(head);

        int n = 2;

        head = removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "nd node from the end:");
        printList(head);
    }
}

