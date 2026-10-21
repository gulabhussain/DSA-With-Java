import java.util.ArrayList;

public class Stack2 {


static class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    // Check whether stack is empty
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // Push: Add element to stack
    public void push(int data) {
        list.add(data);
    }

    // Pop: Remove and return top element
    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        return top;
    }

    // Peek: Return top element without removing it
    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return list.get(list.size() - 1);
    }
}

public static void main(String[] args) {

    Stack s = new Stack();

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    // Print and remove elements
    while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
    }
}


}
