package com.sprinboottest.demo.repository;

import com.sprinboottest.demo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {

}
