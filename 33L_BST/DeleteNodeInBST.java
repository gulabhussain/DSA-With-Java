public class DeleteNodeInBST {
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

    // //search key in binary search tree
    // public static boolean Search( Node root , int key){   //O(H)
    //     if(root == null){
    //         return false;
    //     }

    //     if( root.data > key){
    //         return Search(root.left, key);
    //     } else if (root.data == key){
    //         return true;
    //     } else {
    //         return Search(root.right, key);
    //     }
    // }

    //delete node
    static Node deleteNode(Node root, int val ){
        if( root.data > val){
            root.left = deleteNode(root.left, val);
        } 
        else if(root.data < val) {
            root.right = deleteNode(root.right, val);
        } else{ // root.data == val

            //case1 no child
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2  having one child
            if(root.left ==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3  having two child
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);

        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while(root.left !=null){
            root = root.left;
        }

        return root;

    }




    public static void main (String[] args){
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root=null;

        for ( int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        // 
        
        // deleteNode(root,4);
        // inOrder(root);
        // System.out.println();

        // deleteNode(root,10);
        // inOrder(root);
        // System.out.println();

        deleteNode(root,5);
        inOrder(root);
        System.out.println();
    }
    
}
