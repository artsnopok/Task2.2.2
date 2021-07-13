package web.model;

public class Car {
    private String model;
    private int capacity;
    private int mileage;

    public Car() {
    }

    public Car(String model, int capacity, int mileage) {
        this.model = model;
        this.capacity = capacity;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", mileage=" + mileage +
                '}';
    }
}
