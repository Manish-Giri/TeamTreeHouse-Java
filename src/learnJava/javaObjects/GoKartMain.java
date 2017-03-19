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
        kart.charge();
        System.out.println(kart.isFullyCharged());
        kart.drive(1);

        try {
            kart.drive(42);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

}
