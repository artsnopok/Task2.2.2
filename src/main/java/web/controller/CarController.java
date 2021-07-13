package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 420, 98000));
        cars.add(new Car("Toyota", 180, 60000));
        cars.add(new Car("Lada", 90, 250000));
        cars.add(new Car("Ford", 115, 120000));
        cars.add(new Car("Mazda", 250, 13000));
        cars = CarService.getCarsByCount(cars, count);
        model.addAttribute("getCars", cars);
        return "cars";
    }
}
