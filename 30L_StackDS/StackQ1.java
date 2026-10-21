// push the buttom of stack

import java.util.Stack;

public class StackQ1 {
    public static void pushBottom(Stack<Integer> stk, int data) {
        if (stk.isEmpty()) {
            stk.push(data);
            return;
        }

        int top = stk.pop();
        pushBottom(stk, data);
        stk.push(top);
    }
    
    public static void main(String[] args) {


        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        System.out.println(stk);

        pushBottom(stk, 6);
        
        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
    
}
