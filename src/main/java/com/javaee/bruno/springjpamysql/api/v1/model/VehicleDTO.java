package com.javaee.bruno.springjpamysql.api.v1.model;

import com.javaee.bruno.springjpamysql.domain.FuelType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDTO {

	private Long id;
	
	private String name;
	
	private Integer year;
	
	private FuelType fuelType;
}
