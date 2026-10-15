
class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}


class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class opps1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Gulab";
        s1.age = 20;
        s1.printInfo();


        //pen pen1 = new pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // // System.out.println("Color :" + pen1.color);
        // // System.out.println("Type :" + pen1.type);
        // pen1.write();
        // pen1.printColor();
        // pen1.printType();

        // pen pen2 = new pen();
        // pen2.color = "red";
        // pen2.type = "ballpoint";
        // pen2.write();
        // pen2.printColor();
        // pen2.printType();
    }
    
}
