package com.statefarm.bike_shop;

import com.statefarm.bike_shop.entity.Bike;
import com.statefarm.bike_shop.entity.Customer;
import com.statefarm.bike_shop.entity.Service;
import com.statefarm.bike_shop.entity.Technician;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class BikeShopApplicationTests {

//	@Autowired
//	private Bike bikeRepository;
//
//	@Autowired
//	private Customer customerRepository;
//
//	@Autowired
//	private Service serviceRepository;
//
//	@Autowired
//	private Technician technicianRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	void canSaveCustomer() {
//		Customer tod = new Customer();
//		assertNull(tod.getId());
//	}

}
