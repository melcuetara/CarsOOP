import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final double gasPerLiter = 15.5;
    public static Random random = new Random();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 
        String[] names = {"Lamborghini", "Ford", "Ferrari", "Porsche", "Audi", "Bugatti"};
        String[] models = {"Cullinan", "Dawn", "Ghost", "Phantom", "Wraith", "Sweptail"};
        String[] places = {"Cebu", "Manila", "Baguio", "Davao", "Bohol", "Siquijor", "Boracay"};
        String[] places1 = {"Tokyo", "Okinawa", "Saitama", "Kyoto", "Nagoya"};

        Mustang mustang = new Mustang("vroooom", 30, "GT", "3", "Ford", 2020, "Cebu City", 50.0);
        RollsRoyce rollsRoyce = new RollsRoyce("Rawwwwr", 28, "Phantom", "VII", "Rolls-Royce", 2020, "Manila City", 40.0);
        
        Car[] cars = new Car[3]; 
        Car[] twoCars = new Car[2];

        for (int i = 0; i < cars.length; i++) {
            int year = random.nextInt(21) + 2000;
            double gas = random.nextInt(8001);
            gas /= 100;
            gas += 20;
            cars[i] = new Car(names[random.nextInt(names.length)], models[random.nextInt(models.length)], 
                             "Rolls-Royce", year, places[random.nextInt(places.length)], gas);
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". The car " + cars[i].getName() + " " + cars[i].getYear() 
                         + " is Modeled from " + cars[i].getModel() + " is currently at " + cars[i].getLocation() 
                         + ", gas currently at " + cars[i].getGas() + "L");
        }
        
        for (int i = 0; i < cars.length; i++) {
            cars[i].travel(places1[random.nextInt(places1.length)]);
        }

        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < cars.length; i++) {
            
            System.out.println((i + 1) + ". The car " + cars[i].getName() + " is now travelling to " 
                             + cars[i].getLocation());
        }   

        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car: " + (i + 1));
            cars[i].travel();
        }

        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < cars.length; i++) {
            
            System.out.println((i + 1) + ". The car " + cars[i].getName() + " travelled to " 
                             + cars[i].getLocation() + ", current gas at " + String.format("%.2f",cars[i].getGas()) + "L");
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println(mustang.getSound() + ". The car " + mustang.getName() + " " + mustang.getModel() + " " + mustang.getYear() 
                          + " is currently at " + mustang.getLocation() + ", gas currently at " + mustang.getGas() + "L");

        System.out.println(rollsRoyce.getSound() + ". The car " + rollsRoyce.getName() + " " + rollsRoyce.getModel() + " " + rollsRoyce.getYear() 
                          + rollsRoyce.getModel() + " is currently at " + rollsRoyce.getLocation() + ", gas currently at " + rollsRoyce.getGas() + "L");

        System.out.println("-----------------------------------------------------------");
        System.out.println("For Mustang");
        mustang.travel();
        System.out.println("For Rolls Royce");
        rollsRoyce.travel();
        System.out.println("-----------------------------------------------------------");
        System.out.println(mustang.getSound() + ". The car " + mustang.getName() + " travelled at " + mustang.getLocation() 
                          + ", gas currently at " + String.format("%.2f",mustang.getGas()) + "L consumes " 
                          + mustang.getGasConsumption() + "Km/L");
        System.out.println((rollsRoyce.getSound() + ". The car " + rollsRoyce.getName() + " travelled at " + rollsRoyce.getLocation() 
                          + ", gas currently at " + String.format("%.2f",rollsRoyce.getGas()) + "L consumes " 
                          + rollsRoyce.getGasConsumption() + "Km/L"));

        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < twoCars.length; i++) {
            System.out.print("Car " + (i + 1) + ". Enter car name: ");
            String name = input.nextLine();
            System.out.print("Car " + (i + 1) + ". Enter car model: ");
            String model = input.nextLine();
            System.out.print("Car " + (i + 1) + ". Enter car brand: ");
            String brand = input.nextLine();
            System.out.print("Car " + (i + 1) + ". Enter car year: ");
            int year = input.nextInt();
            input.nextLine();
            System.out.print("Car " + (i + 1) + ". Enter car location: ");
            String location = input.nextLine();
            System.out.print("Car " + (i + 1) + ". Enter car gas: ");
            double gas = input.nextDouble();
            input.nextLine();
            twoCars[i] = new Car(name, model, brand, year, location, gas);
            System.out.println("-----------------------------------------------------------");
        }

        for (int i = 0; i < twoCars.length; i++) {
            twoCars[i].travel();
            System.out.println((i + 1) + ". The car " + twoCars[i].getName() + " travelled to " 
                             + cars[i].getLocation() + " current gas at " + String.format("%.2f",twoCars[i].getGas()) + "L");
            System.out.println("-----------------------------------------------------------");
        }

        input.close();
    }
}
