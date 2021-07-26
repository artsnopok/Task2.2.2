package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> getCarsByCount(List<Car> cars, int count) {
        if (count <= 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    public static List<Car> makeCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 420, 98000));
        cars.add(new Car("Toyota", 180, 60000));
        cars.add(new Car("Lada", 90, 250000));
        cars.add(new Car("Ford", 115, 120000));
        cars.add(new Car("Mazda", 250, 13000));
        return cars;
    }

}
