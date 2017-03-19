package learnJava.javaObjects;

/**
 * Created by hi on 3/18/2017.
 */
public class GoKartMain {
    public static void main(String[] args) {
        GoKart kart = new GoKart("purple");
        if (kart.isBatteryEmpty()) {
            System.out.println("The battery is empty");
        }
        kart.drive(42);
    }

}
