import java.util.*;
public class findItenaryQ4 {
    public static String getStart( HashMap<String, String> tickt){
        HashMap<String, String> remap = new HashMap<>();

        for(String key : tickt.keySet()){
            remap.put(tickt.get(key), key);
        }

        for(String key : tickt.keySet()){
            if(!remap.containsKey(key)){
                return  key;
            }
        }
        return  null;

    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chenai", "Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chenai");
        tickets.put("Delhi", "Goa");

        String start= getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start= tickets.get(start);
            
        }
        System.out.println(start);
    }
}
