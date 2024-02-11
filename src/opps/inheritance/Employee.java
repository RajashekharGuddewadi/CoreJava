package opps.inheritance;

public class Employee {
    float salary = 10000;
}

 class Programmer extends Employee{
    int bonus = 5000;

     public static void main(String[] args) {
         Programmer E =new Programmer();
         System.out.println(E.salary);
         System.out.println(E.bonus);
     }
}
