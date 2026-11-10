public class TrieDSQ3 {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26]; //a to z
            for ( int i=0; i<26; i++){ // inialiased arr
                children[i] = null;
            }
            eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word){//O(n)
        //int level = 0;
        int len = word.length();
        //int idx = 0;

        Node curr=root;
        for(int level=0; level<len; level++){
            int idx = word.charAt(level)-'a';

            if(curr.children[idx] ==  null){
                curr.children[idx] = new Node();
            }
            
            if(level == word.length()-1){
               curr.children[idx].eow = true;
            }

            curr = curr.children[idx]; 

        }

    }

    public static boolean search(String key){ //O(n)
        Node curr =root;
        for(int i=0; i<key.length(); i++){  //O(L)  L= key length
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }

            if(i == key.length()-1 && node.eow == false){
                return false;
            }
            curr = node;
        }
        return  true;
    }

    public static int coutNode(Node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += coutNode(root.children[i]);
            }
        }
        return  count +1;
    }
    
    
    public static void main(String[] args) {
        //String str = "ababa";
        String str = "apple";

        for(int i = 0; i<str.length(); i++){
            String suffix = str.substring(i);
            System.out.println(suffix);
            insert(suffix);
        
        }

        System.out.println(coutNode(root));
        
        
    }
    
}
