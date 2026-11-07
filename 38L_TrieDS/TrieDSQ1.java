public class TrieDSQ1 {
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

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return  true;
        }

        for (int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);

            if(search(firstPart) && wordBreak(secPart)){
                return  true;
            }
        }
        return  false;
    }
    
    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};

        String key = "ilikesamsung";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
        
    }    
    
}
