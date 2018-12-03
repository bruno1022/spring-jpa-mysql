package com.javaee.bruno.springjpamysql.api.v1.mapper;

import com.javaee.bruno.springjpamysql.api.v1.model.GasStationDTO;
import com.javaee.bruno.springjpamysql.domain.GasStation;

public class GasStationMapper {

	public GasStationDTO gasStationToGasStationDTO(GasStation gasStation) {
		final GasStationDTO gasStationDTO = new GasStationDTO();
		gasStationDTO.setId(gasStation.getId());
		gasStationDTO.setName(gasStation.getName());
		return gasStationDTO;
	}

    public GasStation gasStationDTOToGasStation(GasStationDTO gasStationDTO) {
    	final GasStation gasStation = new GasStation();
		gasStation.setId(gasStationDTO.getId());
		gasStation.setName(gasStationDTO.getName());
		return gasStation;
    }
}
