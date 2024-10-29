public class Car extends Vehicle {
    public Car(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear);
    }

    @Override
    public double calculateTax() {
        return engineCapacity * 0.02;
    }
}
