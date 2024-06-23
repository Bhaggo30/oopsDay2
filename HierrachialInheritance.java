class Vehicle{
    String brand = "maruti";
}
class Car extends Vehicle{
    int cost = 200000;
     public void start(){
         System.out.println("the car is started");
     }
}
class Bike extends Vehicle{
    String color = "black";
    public void stop(){
        System.out.println("the bike is stopped");
    }
}
public class HierrachialInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("the brand of the car "+c.brand);
        System.out.println("the cost of the car "+c.cost);

        c.start();

        Bike b = new Bike();
        System.out.println("the brand of the bike "+b.brand);
        System.out.println("the color of the bike "+b.color);
        b.stop();

    }
}
