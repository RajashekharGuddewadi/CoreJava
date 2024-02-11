package opps.inheritance;

class Employee2{
    int id;
    String name;
    Address address;

    public Employee2(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return id + " : " + name + " : " + address ;
    }
}

public class Aggregation_Has_a {
    public static void main(String[] args) {
        Address adress1 = new Address("Pune","Maharashtra","India");
        Employee2 e = new Employee2(100,"Raj",adress1);
        System.out.println(e);
    }
}
