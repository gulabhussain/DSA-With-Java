import java.util.Stack;

public class ReverseStack {

    public static void pushBottom(Stack<Integer> stk, int data) {
        if (stk.isEmpty()) {
            stk.push(data);
            return;
        }

        int top = stk.pop();
        pushBottom(stk, data);
        stk.push(top);
    }

    public static void reverseStack(Stack<Integer> stk) {
        if (stk.isEmpty()) {
            return;
        }

        int top = stk.pop();
        reverseStack(stk);
        pushBottom(stk, top);
    }

    public static void main(String[] args) {


        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        System.out.println("Original Stack: " + stk);

        
        // pushBottom(stk, 6);
        reverseStack(stk);
        System.out.println("Reversed Stack: ");
        
        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }

    }
    
}
