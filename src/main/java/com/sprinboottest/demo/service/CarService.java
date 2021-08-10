package com.sprinboottest.demo.service;

import com.sprinboottest.demo.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    Car get(Long id);
    Car save(Car c);
}
