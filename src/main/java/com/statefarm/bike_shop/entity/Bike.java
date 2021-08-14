package com.statefarm.bike_shop.entity;


import javax.persistence.*;

@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 80)
    private String name;

    private String description;

    private Integer speed;

    public Bike() {};

    public Bike(String name, String description, Integer speed) {
        this.name = name;
        this.description = description;
        this.speed = speed;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
}
