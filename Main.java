import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final double gasPerLiter = 15.5;
    public static Random random = new Random();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 
        String[] models = {"Cullinan", "Dawn", "Ghost", "Phantom", "Wraith"};
        String[] places = {"Cebu", "Manila", "Baguio", "Davao", "Bohol"};
        String[] places1 = {"Tokyo", "Okinawa", "Saitama", "Kyoto", "Nagoya"};
        Car[] cars = new Car[3]; 

        for (int i = 0; i < cars.length; i++) {
            int year = random.nextInt(21) + 2000;
            double gas = random.nextInt(10001);
            gas /= 100;
            cars[i] = new Car(models[random.nextInt(4)], models[random.nextInt(4)], 
                             "Rolls-Royce", year, places[random.nextInt(4)], gas);
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". The car " + cars[i].getName() + " is currently at " + cars[i].getLocation());
        }

        System.out.println(System.lineSeparator());
        for (int i = 0; i < cars.length; i++) {
            cars[i].travel(places1[random.nextInt(4)]);
        }

        System.out.println(System.lineSeparator());
        for (int i = 0; i < cars.length; i++) {
            
            System.out.println((i + 1) + ". The car " + cars[i].getName() + " is now traveling to " 
                             + cars[i].getLocation() + " gas at : " + cars[i].getGas());
        }   

        for (int i = 0; i < cars.length; i++) {
            cars[i].travel();
        }

        input.close();
    }
}
