package com.sprinboottest.demo.serviceimpl;

import com.sprinboottest.demo.models.Car;
import com.sprinboottest.demo.repository.CarRepository;
import com.sprinboottest.demo.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car get(Long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public Car save(Car c) {
        return carRepository.save(c);
    }
}
