public class QusingLL {


    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Check whether Queue is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Add element
        public static void add(int data) {
            Node newNode = new Node(data);

            if (tail == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Remove element
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;

            if (head == tail) {
                tail = null;
            }

            head = head.next;

            return front;
        }

        // Get front element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Print and remove elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }


}
