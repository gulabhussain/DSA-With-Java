public class Q1_18C2ReverseStr {
    public static void printRev( String str1 , int idx){
        if(idx==0){
            System.out.println(str1.charAt(idx));
            return ;
        }
        System.out.print(str1.charAt(idx));
        printRev(str1 , idx-1);

    }
    public static void main (String[] args){
        String str1= "abcdefg";
        
        printRev(str1 , str1.length()-1);

    }
    
}
