import java.util.Scanner;

public class Car {
    
    private String name;
    private String model;
    private String brand;
    private int year;
    private String location;
    private double gas;
    public Scanner input = new Scanner(System.in);


    public Car(String name, String model, String brand, int year, String location, double gas) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
        this.gas = gas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void travel(String location) {
        this.location = location;
    }

    public void travel() {
        System.out.print("Which place do you want to travel? ");
        travel(input.nextLine());
        System.out.print("Distance of the destination (km)?  ");
        setGas(input.nextDouble());

    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }
    
}
