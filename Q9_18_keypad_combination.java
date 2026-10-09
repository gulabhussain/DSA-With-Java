/*
Q9. Print keypad combination 
( 0 -> .; 
 1 -> abc 
 2 -> def 
 3 -> ghi 
 4 -> jkl 
 5 -> mno 
 6 -> pqrs 
 7 -> tu 
 8 -> vwx 
 9 -> yz ) 
*/

public class Q9_18_keypad_combination {
      public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"}; 

      public static void printKeypadCombination(String number, int idx, String res) { 

        if(idx == number.length()) { 
            System.out.println(res); 
            return; 
        } 

        char currChar = number.charAt(idx); 
        String maping =keypad[currChar-'0'];

        for(int i=0; i<maping.length(); i++) { 
            
            printKeypadCombination(number, idx+1, res+maping.charAt(i)); 
        } 
    } 
            public static void main(String args[]) { 
                String number = "23";
                 printKeypadCombination(number, 0, ""); 
            }  
}
