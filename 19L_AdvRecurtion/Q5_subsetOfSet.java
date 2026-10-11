import java.util.*;

public class Q5_subsetOfSet {


public static void printSubset(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
    }
    System.out.println();
}

public static void printSubset(int n, ArrayList<Integer> list, int i) {

    // Base case
    if (i > n) {
        printSubset(list);
        return;
    }

    // Include the element
    list.add(i);
    printSubset(n, list, i + 1);

    // Backtracking: remove the element
    list.remove(list.size() - 1);

    // Exclude the element
    printSubset(n, list, i + 1);
}

public static void main(String[] args) {
    int n = 3;
    ArrayList<Integer> list = new ArrayList<>();

    printSubset(n, list, 1);
}


}
