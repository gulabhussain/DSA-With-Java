//package 33L_BST;

public class BSTinOrder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }

    }
    static Node insert(Node root, int val){

        if(root ==null){
            return new Node(val);
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    //inorder traversal
    public static void inOrder(Node root){
        if(root !=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void main (String[] args){
        int values[] = { 5, 1, 3, 4, 2, 7};
        Node root=null;

        for ( int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        //System.out.println();
    }
    
}
