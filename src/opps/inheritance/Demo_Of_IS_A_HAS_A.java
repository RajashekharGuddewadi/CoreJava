package opps.inheritance;

class Bike{
    private String color;
    private int maxSpeed;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void bikeInfo(){
        System.out.println("Bike Color "+color+" Max Speed "+maxSpeed);
    }
}

class Engine{
    public void start(){
        System.out.println("Engine Start");
    }
    public void stop(){
        System.out.println("Engine stop");
    }

}
class Pulsar extends Bike{  // IS-A Relation

    public void startDemo() {
        Engine PulsarEngine = new Engine(); //HAS



        // -A Relation
        PulsarEngine.stop();
    }
}
public class Demo_Of_IS_A_HAS_A {
    public static void main(String[] args) {
    Pulsar p = new Pulsar();
    p.setColor("Red");
    p.setMaxSpeed(80);
    p.bikeInfo();
    p.startDemo();
    }
}
