class student {
    String name;
    static String school;
}
public class Static {
    public static void main(String[] args) {
        student.school = "JVM School";
        student s1 = new student();
        s1.name = "Gulab";
        
        student s2 = new student();
        s2.name = "Rahul";

        System.out.println(s1.name + " studies in " + student.school);
        System.out.println(s2.name + " studies in " + student.school);
    }
    
}
