package com.statefarm.bike_shop.repositories;

import com.statefarm.bike_shop.entity.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends CrudRepository<Service, Long> {
}
