public class Bus extends Vehicle {
    public Bus(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear);
    }

    @Override
    public double calculateTax() {
        return engineCapacity * 0.015;
    }
}
