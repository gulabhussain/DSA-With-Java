import java.util.Stack;

public class StackExample {
public static void main(String[] args) {


    Stack<Integer> stk = new Stack<>();

    stk.push(10);
    stk.push(30);
    stk.push(40);
    stk.push(50);

    System.out.println(stk);

    System.out.println("Top: " + stk.peek());

    System.out.println("Remove: " + stk.pop());
}


}
