package com.javaee.bruno.springjpamysql.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javaee.bruno.springjpamysql.domain.Garage;
import com.javaee.bruno.springjpamysql.domain.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long>{

	List<Vehicle> findByGarage(Garage garage);
}
