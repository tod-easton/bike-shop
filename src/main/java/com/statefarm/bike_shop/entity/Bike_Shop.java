package com.statefarm.bike_shop.entity;


import javax.persistence.*;


@Entity
public class Bike_Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 80)
    private String location;

    @Column(nullable = false)
    private Integer daysToComplete;

    public Bike_Shop() {}

    public Bike_Shop(String location, Integer daysToComplete) {
        this.location = location;
        this.daysToComplete = daysToComplete;
    }

    public Integer getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Integer getDaysToComplete() {
        return daysToComplete;
    }
}
