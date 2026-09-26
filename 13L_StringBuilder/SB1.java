public class SB1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Gulab Hussain");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char 
        sb.setCharAt(0,'M');
        System.out.println(sb);

        // insert character at some index
        sb.insert(6,'M');
        System.out.println(sb);

        //delete char at some index
        sb.delete(6,7);
        System.out.println(sb);

        //set char 
        sb.setCharAt(0,'G');
        System.out.println(sb);

        // append -> last me add karna
        StringBuilder a = new StringBuilder("H");
        a.append("e");
        a.append("l");
        a.append("l");
        a.append("o");
        System.out.println(a);
        //lprint length
        System.out.println(a.length());

        sb.append(" How are You! ");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
