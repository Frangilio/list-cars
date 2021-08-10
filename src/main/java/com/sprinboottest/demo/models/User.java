package com.sprinboottest.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "email")
    private String email;

    @Column(name = "pseudo")
    private String pseudo;

    @Column(name = "pass")
    private String pass;

    @Column(name = "comment")
    private String comment;

    @ManyToMany(mappedBy = "users")
    Set<Car> cars = new HashSet<>();

    public User() { }
    public User(String name, String firstName, String email, String pseudo, String pass, String comment) {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.pseudo = pseudo;
        this.pass = pass;
        this.comment = comment;
    }

    public User(Long idUser, String name, String firstName, String email, String pseudo, String pass, String comment) {
        this.idUser = idUser;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.pseudo = pseudo;
        this.pass = pass;
        this.comment = comment;
    }

    public Long getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getPass() {
        return pass;
    }

    public String getComment() {
        return comment;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", pseudo='" + pseudo + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
