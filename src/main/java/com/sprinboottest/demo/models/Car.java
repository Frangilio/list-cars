package com.sprinboottest.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar;

    @Column(name = "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "price")
    private float price;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "user_car",
            joinColumns = @JoinColumn(name = "car_id_car"),
            inverseJoinColumns = @JoinColumn(name = "user_id_user")
    )
    private Set<User> users = new HashSet<>();

    public Car() {
    }

    public Car(String brand, String color, Long quantity, float price) {
        this.brand = brand;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    public Car(Long idCar, String brand, String color, Long quantity, float price) {
        this.idCar = idCar;
        this.brand = brand;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    public void users(User userss){

        users.add(userss);
    }

    public Long getIdCar() {
        return idCar;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Long getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
