package com.statefarm.bike_shop.entity;


import javax.persistence.*;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)  //'one' service request (or Service object) for 'one' Bike
    private Bike bikeId;

    private String service;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bike getBikeId() {
        return bikeId;
    }

    public void setBikeId(Bike bikeId) {
        this.bikeId = bikeId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
