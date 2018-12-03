package com.javaee.bruno.springjpamysql.api.v1.mapper;

import com.javaee.bruno.springjpamysql.api.v1.model.VehicleDTO;
import com.javaee.bruno.springjpamysql.domain.Vehicle;

public class VehicleMapper {

	public VehicleDTO vehicleToVehicleDTO(Vehicle vehicle) {
		final VehicleDTO vehicleDTO = new VehicleDTO();
		vehicleDTO.setId(vehicle.getId());
		vehicleDTO.setName(vehicle.getName());
		vehicleDTO.setYear(vehicle.getYear());
		vehicleDTO.setFuelType(vehicle.getFuelType());
		return vehicleDTO;
	}

    public Vehicle vehicleDTOToVehicle(VehicleDTO vehicleDTO) {
    	final Vehicle vehicle = new Vehicle();
		vehicle.setId(vehicleDTO.getId());
		vehicle.setName(vehicleDTO.getName());
		vehicle.setYear(vehicleDTO.getYear());
		vehicle.setFuelType(vehicleDTO.getFuelType());
		return vehicle;
    }
}
