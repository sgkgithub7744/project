package com.cjc.app.fss.ro.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.VehicleDetails;

@Repository
public interface VehicleReository extends CrudRepository<VehicleDetails, Integer>{

	VehicleDetails findByvehicleVIN(String VIN);

	VehicleDetails findByvehicleRegistrationNumber(String RN);

	VehicleDetails findBycustomerDetailsCustomerId(int cid);

	VehicleDetails findByVehicleId(int vehicleId);

}
