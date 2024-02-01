public class Variables {

    int x =10; //instance variable

    static  int y = 15;

    public  void  m(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        //based on type of value represented by variable all variable are divided in two types
        //primitive variables ----- can be used represent primitive values e.g -- int x = 10;
        //reference variables ----- can be used refer objects e.g -- Students s = new Students();

        //Based on position of declaration and behavior all variable divided into three types
        //Instance variable,static variables,Local variables

        //Instance variable
        // if the value of variable is varied from object to object such type of variable are called instance variable
        // for every object a separate copy of instance variable will be created
        // Instance variable should be declared within a class directly but outside any methode or block or constructor
        // instance will be created at time of object creation and destroy at the time of object destruction hence scope of instance variable is scope of object
        // instance variable as stored in heap memory as aa part of object
        // we cant access instance variable in directly from static area, but we can access by using object reference,
        // but we can access instance variable directly from instance area

        //System.out.println(x); // Non-static field 'x' cannot be referenced from a static context
        Variables v = new Variables();
        System.out.println(v.x); // 10
        v.m(); //10



        //------ Static Variable ------
        // if the value of variable is not varied object to object then it is not recommender to declare variable as instance variable we have to declare such type of variables class level by using static modifier
        // in the case of instance variable the every object separate copy will be created in the case of static variable a single copy will create at class level and shared by every object of the class
        // static variable within the class directly but, outside any method or block or constructor
        // scope of static variable is same as .class file
        // static variable stored in method area

        Variables  v1 = new Variables();

        System.out.println(v1.y);
        System.out.println(Variables.y);
        System.out.println(y);
    }
}
