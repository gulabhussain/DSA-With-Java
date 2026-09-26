
public class AccessCharInStr{
    public static void main (String[] args){
        String firstName = "Gulab";
        String lastName = "Hussain";
        //concatanation
        String FullName = firstName + " " + lastName;
        String sentence = "My name is Gulab Hussain";
        System.err.println(FullName);
        System.err.println(sentence);
        for(int i=0; i<FullName.length(); i++ ){
            System.out.println(FullName.charAt(i));
        }
        
    }
}