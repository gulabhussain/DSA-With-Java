
public class SubtreeOfAnotherTree {

    // Binary Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Check whether two trees are identical
    public static boolean isIdentical(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val != subRoot.val) {
            return false;
        }

        return isIdentical(root.left, subRoot.left)
                && isIdentical(root.right, subRoot.right);
    }

    // Check whether subRoot is a subtree of root
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

        /*
                 Main Tree
                     3
                    / \
                   4   5
                  / \
                 1   2
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        /*
                 Subtree
                    4
                   / \
                  1   2
        */

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result = isSubtree(root, subRoot);

        System.out.println("Is Subtree: " + result);
    }
}

