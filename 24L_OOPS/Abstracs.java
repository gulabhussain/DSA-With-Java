abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse is walking on all fours legs");
    }
}    
class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken is walking on two legs");
    }

}
public class Abstracs {
    public static void main(String[] args) {
        Horse a = new Horse();
        a.walk();

        Chicken b = new Chicken();
        b.walk();
    }
    
}
