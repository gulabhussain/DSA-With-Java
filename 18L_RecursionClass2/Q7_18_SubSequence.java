public class Q7_18_SubSequence {
    public static void subsequence( String str, int idx, String newString){
        if (idx ==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        //to be
        subsequence(str , idx +1 , newString+currChar);

        // not to be
        subsequence(str , idx +1 , newString);

    }

    public static void main ( String[] args){
        String str= "abc";
        String str1= "aaa";
       subsequence( str1 ,  0 , "");
        
    }
    
}
