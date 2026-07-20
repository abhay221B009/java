package oops.inheritance;

public class Testing {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();    // Inherited from Animal
        d.bark();   // Dog's own method
    }
}