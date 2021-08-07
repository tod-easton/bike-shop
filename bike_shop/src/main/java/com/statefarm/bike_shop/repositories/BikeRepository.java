package com.statefarm.bike_shop.repositories;

import com.statefarm.bike_shop.entity.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends CrudRepository<Bike, Long> {
}
