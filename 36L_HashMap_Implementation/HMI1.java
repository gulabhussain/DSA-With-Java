
import java.util.*;

public class HMI1 {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Total number of nodes
        private int N; // Total number of buckets

        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.n = 0;

            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(K key) {
            return Math.floorMod(key.hashCode(), N);
        }

        // Search key in linked list
        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        // Rehashing
        @SuppressWarnings("unchecked")
        private void rehash() {

            LinkedList<Node>[] oldBuckets = buckets;

            N = N * 2;

            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            int oldSize = n;
            n = 0;

            for (int i = 0; i < oldBuckets.length; i++) {

                LinkedList<Node> ll = oldBuckets[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    put(node.key, node.value);
                }
            }

            n = oldSize;
        }

        // Insert or update
        public void put(K key, V value) {

            if (key == null) {
                throw new IllegalArgumentException("Null keys are not supported");
            }

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {

                buckets[bi].add(new Node(key, value));
                n++;

            } else {

                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        // Check whether key exists
        public boolean containsKey(K key) {

            if (key == null) {
                return false;
            }

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        // Get value using key
        public V get(K key) {

            if (key == null) {
                return null;
            }

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key not exist
                return null;
            }  
            //key not exist

            Node node = buckets[bi].get(di);

            return node.value;
        }

        // Remove key-value pair
        public V remove(K key) {

            if (key == null) {
                return null;
            }

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key not exist
                return null;
            }

            Node node = buckets[bi].remove(di);

            n--;

            return node.value;
        }

        // Return all keys
        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < N; i++) {

                LinkedList<Node> ll = buckets[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    keys.add(node.key);
                }
            }

            return keys;
        }

        // Check whether map is empty
        public boolean isEmpty() {
            return n == 0;
        }

        // Return total number of key-value pairs
        public int size() {
            return n;
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 130);
        map.put("US", 10);
        map.put("India", 150);

        
        ArrayList<String> keys = map.keySet();
        for(int i=0;  i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        System.out.println("Value of India: " + map.get("India"));

        System.out.println("Value of China: " + map.get("China"));

        System.out.println("Contains India: " + map.containsKey("India"));

        System.out.println("Contains Japan: " + map.containsKey("Japan"));

        System.out.println("All keys: " + map.keySet());

        System.out.println("Size: " + map.size());

        System.out.println("Is Empty: " + map.isEmpty());

        System.out.println("Removed value: " + map.remove("US"));

        System.out.println("All keys after removal: " + map.keySet());

        System.out.println("Size after removal: " + map.size());
    }
}










// import java.util.*;
// public class HMI1 {
//     static class HashMap<K,V>{
//         private class Node{
//             K key;
//             V value;

//             public Node(K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private  int n; // n- nodes
//         private  int N; //N- bucket
//         private LinkedList<Node> buckets[]; //N = buckte.length

//         @SuppressWarnings ("unchecked")
//         public HashMap(){
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for (int i = 0; i < 4; i++) {
//                 this.buckets[i] = new LinkedList<>();
                
//             }
//         }

//         private  int hashFunction(K key){
//             int bi = key.hashCode();
//             return Math.abs(bi) % N;

//         }

//         private  int searchInLL( K key, V value){
//             LinkedList<Node> ll= buckets[bi];

//             for (int i = 0; i < ll.size(); i++) {
//                 return i;
//             }

//             return -1;
//         }

//         private  void rehash(){
//             LinkedList<Node> oldbucket[] = buckets;
//             buckets = new LinkedList[N*2];

//             for (int i = 0; i < N*2; i++) {
//                 buckets[i] = new LinkedList<>();
//             }

//             for (int i = 0; i < oldbucket.length; i++) {
//                 LinkedList<Node> ll = oldbucket[i];
//                 for (int idx = 0; idx < ll.size(); idx++) {
//                     Node node = ll.get(idx);
//                     put(node.key, node.value);
                    
//                 }
                
//             }
//         }

//         public void put(K key, V value){
//             int bi = hashFunction(key); //bi bucket idx di data index
//             int di = searchInLL(key, bi); // data index

//             if (di == -1){ // key does`t exist
//                 buckets[bi].add(new Node(key , value));
//                 n++;
//             } else { // key exist
//                 Node node = buckets[bi].get(di);
//                 node.value = value;

//             }

//             double lambda = (double)n/N;
//             if(lambda > 2.0){
//                 // rehashing
//                 rehash();
//             }

//         }

//         public boolean containsKey(K key){
//             return false;
//         }

//         public V remove( K key){
//             return  null;
//         }

//         public V get( K key){
//             return  null;
//         }

//         public ArrayList<K> keySet(){
//             return null;
//         }

//         public boolean isEmpty(){
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("India", 100);
//         map.put("China", 130);
//         map.put("US", 10);
        

        
//     }
    
// }
