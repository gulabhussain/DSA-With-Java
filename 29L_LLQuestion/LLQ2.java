
// Check whether a Linked List is a Palindrome

public class LLQ2 {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Add node at the end
    public static ListNode addLast(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

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

    // Print Linked List
    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    // Reverse Linked List
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Find Middle of Linked List
    public static ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    // Check Palindrome
    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle
        ListNode middle = findMiddle(head);

        // Step 2: Reverse second half
        ListNode secondHalfStart = reverse(middle.next);

        // Connect the first half to the reversed second half
        middle.next = secondHalfStart;

        ListNode firstHalfStart = head;
        ListNode secondHalf = secondHalfStart;

        // Step 3: Compare both halves
        boolean palindrome = true;

        while (secondHalf != null) {
            if (firstHalfStart.val != secondHalf.val) {
                palindrome = false;
                break;
            }

            firstHalfStart = firstHalfStart.next;
            secondHalf = secondHalf.next;
        }

        // Step 4: Restore original Linked List
        middle.next = reverse(secondHalfStart);

        return palindrome;
    }

    public static void main(String[] args) {

        ListNode head = null;

        // Create Linked List
        head = addLast(head, 1);
        head = addLast(head, 2);
        head = addLast(head, 2);
        head = addLast(head, 1);

        System.out.println("Original Linked List:");
        printList(head);

        // Check Palindrome
        if (isPalindrome(head)) {
            System.out.println("Linked List is a Palindrome.");
        } else {
            System.out.println("Linked List is NOT a Palindrome.");
        }

        // Check whether the original list is restored
        System.out.println("Linked List after checking:");
        printList(head);
    }
}

