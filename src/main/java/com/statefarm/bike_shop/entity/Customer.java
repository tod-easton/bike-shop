package com.statefarm.bike_shop.entity;


import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)  //'many' customers (or Customer object) for 'one' Bike
    private Bike bike;

    @ManyToOne(fetch = FetchType.EAGER)  //'many' customers (or Customer object) for 'one' Service
    private Service service;

    private String name;

    private Boolean chosen = false;

    public Customer() {}

    public Customer(String name, Bike bike) {
        this.name = name;
        this.bike = bike;
    }

    public Long getId() {
        return id;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
