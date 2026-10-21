// linklist implementation of stack
public class Stack1 {

    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {

        static Node top;

        // Check if stack is empty
        public static boolean isEmpty() {
            return top == null;
        }

        // Push operation
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                top = newNode;
                return;
            }

            newNode.next = top;
            top = newNode;
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int poppedData = top.data;
            top = top.next;

            return poppedData;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return top.data;
        }
    }

    public static void main(String[] args) {

        // Push elements into stack
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);

        // Print and remove elements
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}

