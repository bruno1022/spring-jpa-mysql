package com.javaee.bruno.springjpamysql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.javaee.bruno.springjpamysql.domain.Garage;

public interface GarageRepository extends CrudRepository<Garage, Long>{

}
