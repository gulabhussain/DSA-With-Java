

public class Q1_Permutation_all {
    public static void printPermutation(String str, int idx, String perm) {
        // Base case
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, idx + 1, perm + ch);
        }
    }
    public static void main(String[] args) {
        String str = "ABCD";
        printPermutation(str, 0, "");
    }
    
}
