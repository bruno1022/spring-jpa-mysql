package com.javaee.bruno.springjpamysql.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javaee.bruno.springjpamysql.domain.Garage;
import com.javaee.bruno.springjpamysql.domain.GasStation;

public interface GasStationRepository extends CrudRepository<GasStation, Long>{

	List<GasStation> findByGarage(Garage garage);
}
