package com.statefarm.bike_shop.repositories;

import com.statefarm.bike_shop.entity.Technician;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TechnicianRepository extends CrudRepository<Technician, Long> {
}
