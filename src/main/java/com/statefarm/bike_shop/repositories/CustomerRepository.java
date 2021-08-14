package com.statefarm.bike_shop.repositories;

import com.statefarm.bike_shop.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findByChosen(Boolean choice);

    List<Optional<Customer>> findAllByChosen(Boolean choice);

    @Override
    List<Customer> findAll();
}
