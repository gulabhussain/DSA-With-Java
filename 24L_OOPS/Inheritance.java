
//inheritance in java

// class Shape {
//     String color;
// }

// class Circle extends Shape {
   
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.color = "Red";
//         System.out.println("Circle color: " + c.color);
        
//     }
// }




// single level inheritance




// class Shape {
//    public void area() {
//         System.out.println("Calculating area");
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println(1/2*l*h);
//     }
   
// }



// public class Inheritance {
//     public static void main(String[] args) {
//         Triangle t = new Triangle();
//         t.area(5, 10);
        
//     }
// }





// multilevel inheritance

class Shape {
   public void area() {
        System.out.println("Calculating area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
   
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(5, 10);
        
        Circle c = new Circle();
        c.area(5);
    }
}



// single level inheritance

// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         Dog d = new Dog();

//         d.eat();
//         d.bark();
//     }
// }



// // multilevel inheritance

// class Animal {
//     void eat() {
//         System.out.println("Eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking");
//     }
// }

// class Puppy extends Dog {
//     void weep() {
//         System.out.println("Puppy is crying");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         Puppy p = new Puppy();

//         p.eat();
//         p.bark();
//         p.weep();
//     }
// }





// Hierarchical Inheritance 


// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// class Cat extends Animal {
//     void meow() {
//         System.out.println("Cat is meowing");
//     }
// }

// public class OOPs8 {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         Cat c = new Cat();

//         d.eat();
//         d.bark();

//         c.eat();
//         c.meow();
//     }
// }
