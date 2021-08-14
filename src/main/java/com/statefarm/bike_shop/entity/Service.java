package com.statefarm.bike_shop.entity;


import javax.persistence.*;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 80)
    private String service;

    public Service() {};

    public Service(String service) {
        this.service = service;
    }


    public Long getId() {
        return id;
    }

//    public Bike getBikeId() {
//        return bikeId;
//    }

//    public void setBikeId(Bike bikeId) {
//        this.bikeId = bikeId;
//    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
