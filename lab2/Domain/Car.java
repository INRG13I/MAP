package Domain;

public class Car extends Entity {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car: \n" +
                "   Id: " + this.getId() + "\n" +
                "   Make: " + make + "\n" +
                "   Model: " + model + "\n";
    }
}
