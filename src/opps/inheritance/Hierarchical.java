package opps.inheritance;

class Animal1{
    void eat(){
        System.out.println("eating......");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Barking......");
    }
}
class Cat extends Animal1{
    void meow(){
        System.out.println("meowing........");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        Dog1 d = new Dog1();
        d.bark();
        d.eat();
    }
}
