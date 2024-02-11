package opps.inheritance;
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping");
    }
    void bark(){
        System.out.println("Baby Barking...");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}
