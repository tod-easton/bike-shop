package com.statefarm.bike_shop.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike_Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;

    private Customer customer;

    private Service serviceId;

    private String location;
}
