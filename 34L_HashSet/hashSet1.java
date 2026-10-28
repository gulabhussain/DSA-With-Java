import java.util.HashSet;
import java.util.Iterator;

public class hashSet1 {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // list.add(el)    // duplicate consider nahi karta hai
 
        // print all set element
        System.out.println(set);

        //size
        System.out.println("size of set is : " + set.size());

        // iterator in set
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        // searching -- contains
        if(set.contains(1)){
            System.out.println("Set contain 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contain - we delete 1");
        }

        
    }
    
}
