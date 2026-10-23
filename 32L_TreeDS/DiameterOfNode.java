// Approach 1 : O(n^2)

public class DiameterOfNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node ( int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }



    // public static int SumOfNode( Node root){
    //     if( root == null){
    //         return 0;
    //     }

    //     int leftSum = SumOfNode(root.left);
    //     int rightSum = SumOfNode(root.right);
    //     return leftSum + rightSum + root.data;
    // }

    public static int hightOfNode( Node root){
        if( root == null){
            return 0;
        }

        int lefthight = hightOfNode(root.left);
        int righthight = hightOfNode(root.right);
        return Math.max(lefthight , righthight) +1;
    }

    public static int DiameterOfNode( Node root){
        if( root == null){
            return 0;
        }

        int diam1 = DiameterOfNode(root.left);
        int diam2 = DiameterOfNode(root.right);
        int diam3 = hightOfNode(root.left) + hightOfNode(root.right) +1;
        return Math.max(diam3, Math.max(diam1 , diam2));
    }


    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
       
        
        
        System.out.println(DiameterOfNode(root));
    }
}
