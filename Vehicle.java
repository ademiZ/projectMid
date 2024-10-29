public abstract class Vehicle {
    private int engineCapacity; // in CC
    private int manufactureYear;
    private VehicleType vehicleType;

    public Vehicle(int engineCapacity, int manufactureYear, VehicleType vehicleType) {
        this.engineCapacity = engineCapacity;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract double calculateTax();
}