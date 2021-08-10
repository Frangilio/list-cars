package com.sprinboottest.demo.beans;

import com.sprinboottest.demo.models.Car;
import com.sprinboottest.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/list_cars")
    public String listCarss(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "list_cars";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditCarForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_car");

        Car carr = carService.get(id);
        mav.addObject("car", carr);

        return mav;
    }

    @PostMapping("/update")
    public ModelAndView updateCar(Car car) {
        ModelAndView mav = new ModelAndView("list_cars");
        carService.save(car);

        List<Car> cars = carService.getAllCars();
        mav.addObject("cars", cars);
        return mav;
    }
}
