public class Truck extends Vehicle {
    public Truck(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear);
    }

    @Override
    public double calculateTax() {
        return engineCapacity * 0.03;
    }
}
