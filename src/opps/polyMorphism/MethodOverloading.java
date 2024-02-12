package opps.polyMorphism;

class Add{
    static  int add(int a,int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    static float add(float a,float b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }

    static void name(String n){
        System.out.println("name : " + n);
    }
    static void  name(String n,String m){
        System.out.println("first name : " + n+"\n" +"last name : "+ m );
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Add.add(5,5));
        System.out.println(Add.add(5,5,5));
        System.out.println(Add.add(55555.5f,5555.5f));
        System.out.println(Add.add(5.5,5.5));

        Add.name("Raj");
        Add.name("Raj","Guddewadi");
    }
}
