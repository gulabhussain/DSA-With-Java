
import java.util.*;

public class SumOfKthLevel {

    // Binary Tree Node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Sum of nodes at Kth level
    public static int sumAtKthLevel(Node root, int k) {

        if (root == null || k < 0) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 0;
        int sum = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {

                Node current = q.remove();

                if (level == k) {
                    sum += current.data;
                }

                if (current.left != null) {
                    q.add(current.left);
                }

                if (current.right != null) {
                    q.add(current.right);
                }
            }

            if (level == k) {
                return sum;
            }

            level++;
        }

        return 0;
    }

    public static void main(String[] args) {

        /*
                  1          Level 0
                 / \
                2   3        Level 1
               / \   \
              4   5   6      Level 2
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int k = 2;

        int result = sumAtKthLevel(root, k);

        System.out.println("Sum of nodes at level " + k + " = " + result);
    }
}

