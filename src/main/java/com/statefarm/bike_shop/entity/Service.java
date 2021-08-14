package com.statefarm.bike_shop.entity;

import com.statefarm.bike_shop.enums.ServiceName;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ServiceName serviceName;

    private Integer cost;

    public Service() {}

    public Service(ServiceName serviceName) {
        this.serviceName = serviceName;

        switch (serviceName) {
            case REPAIR_TIRE:
                cost = 5;
                break;
            case REPLACE_CHAIN:
                cost = 20;
                break;
            case TUNE_UP:
                cost = 50;
                break;
            case SERVICE_BREAKS:
                cost = 30;
                break;
        }
    }

    public Long getId() {
        return id;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }

    public Integer getCost() {
        return cost;
    }
}
