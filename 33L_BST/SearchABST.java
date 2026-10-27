// search key in binary search tree

public class SearchABST {
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

    //search key in binary search tree
    public static boolean Search( Node root , int key){   //O(H)
        if(root == null){
            return false;
        }

        if( root.data > key){
            return Search(root.left, key);
        } else if (root.data == key){
            return true;
        } else {
            return Search(root.right, key);
        }
    }


    public static void main (String[] args){
        int values[] = { 5, 1, 3, 4, 2, 7};
        Node root=null;

        for ( int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if(Search(root,2)){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }
    }
    
}
