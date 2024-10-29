import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.*;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;

public class VehicleTaxCalculator extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label studentInfo = new Label("Student ID: 23010709, Name: Ademi, Surname: Zamirbekova");
        Label instructions = new Label("Select vehicle type and enter details:");

        ChoiceBox<VehicleType> vehicleTypeChoiceBox = new ChoiceBox<>();
        vehicleTypeChoiceBox.getItems().addAll(VehicleType.CAR, VehicleType.BUS, VehicleType.TRUCK);

        TextField engineCapacityField = new TextField();
        engineCapacityField.setPromptText("Engine Capacity (CC)");

        TextField manufactureYearField = new TextField();
        manufactureYearField.setPromptText("Manufacture Year");

        Button calculateButton = new Button("Calculate Tax");
        Label resultLabel = new Label();

        calculateButton.setOnAction(e -> {
            try {
                VehicleType selectedType = vehicleTypeChoiceBox.getValue();
                int engineCapacity = Integer.parseInt(engineCapacityField.getText());
                int manufactureYear = Integer.parseInt(manufactureYearField.getText());

                Vehicle vehicle;
                switch (selectedType) {
                    case CAR -> vehicle = new Car(engineCapacity, manufactureYear);
                    case BUS -> vehicle = new Bus(engineCapacity, manufactureYear);
                    case TRUCK -> vehicle = new Truck(engineCapacity, manufactureYear);
                    default -> throw new IllegalStateException("Unknown vehicle type");
                }
                double tax = vehicle.calculateTax();
                resultLabel.setText("Calculated tax: " + tax);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error:Please valid enter data.");
            }
        });

        VBox layout = new VBox(10, studentInfo, instructions, vehicleTypeChoiceBox, engineCapacityField, manufactureYearField, calculateButton, resultLabel);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vehicle Tax Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
