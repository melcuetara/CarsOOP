public class Mustang extends Car{

    private String sound;
    private double gasConsumption;

    public Mustang(String sound, double gasConsumption, String name, String model, String brand, int year, String location, double gas) {
        super(name, model, brand, year, location, gas);
        this.sound = sound;
        this.gasConsumption = gasConsumption;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }
    
    public void travel() {
        System.out.print("Which place do you want to travel? ");
        travel(input.nextLine());
        System.out.print("Distance of the destination (km)?  ");
        calculateGasUsed(input.nextDouble(), getGasConsumption());
    }

    private void calculateGasUsed(double distance, double gasConsumption) {
        double newGas = super.getGas() - (distance / gasConsumption);
        super.setGas(newGas);
    }
    
    
}
