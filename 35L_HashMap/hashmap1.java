import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
        // country(key)   , population (value)
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("india", 120);
        map.put("us", 30);
        map.put("china", 150);

        System.out.println(map);

        map.put("china", 160);
        System.out.println(map);

        // // search 
        // if(map.containsKey("china")){
        //     System.out.println("Key is present in the map ");
        // } else {
        //     System.out.println("Key is not present in the map");
        // }

        // System.out.println(map.get("india"));// key exist
        // System.out.println(map.get("indonesia")); // key not exist


        //iteration
        // int arr[] = {12, 15, 18};

        // // 1st method
        // for ( int i = 0; i<3; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // //2nd method
        // for(int var : arr){
        //     System.out.print(var + " ");
        // }
        // System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // iteration 2
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " +map.get(key));
        }

        // remove 
        map.remove("china");
        System.out.println(map);
    }
    
}
