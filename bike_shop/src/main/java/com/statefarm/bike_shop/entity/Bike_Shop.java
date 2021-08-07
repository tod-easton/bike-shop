package com.statefarm.bike_shop.entity;


import javax.persistence.*;

@Entity
public class Bike_Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;

//    private Customer customer;

    @ManyToOne  //'many' service requests (or Service objects) for 'one' Customer
    private Service serviceId;

    private String location;
}
