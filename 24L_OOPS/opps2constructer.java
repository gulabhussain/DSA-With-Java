public class opps2constructer {

    String name;
    int age;

    // Constructor
    opps2constructer(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating objects
        opps2constructer s1 = new opps2constructer("Gulab", 21);
        opps2constructer s2 = new opps2constructer("Rahul", 22);

        s1.display();
        s2.display();
    }


}
