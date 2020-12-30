package com.cjc.app.fss.ro.main.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="ro_service")
public class ROService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ro_service_id")
	private int roServiceId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	//@JoinColumn(name="servicetype_id")
	private Set<ServiceType> serviceType= new HashSet<ServiceType>();
	
	@Column(name="service_repair_quantity")
	private int serviceRepairQuantity;
	
	@Temporal(TemporalType.DATE)
	@Column(name="arrival_date")
	private Date arrivalDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name="arrival_time")
	private Date arrivalTime;
	
	@Temporal(TemporalType.DATE)
	@Column(name="promised_date")
	private Date promisedDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name="promised_time")
	private Date promisedTime;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="cutomer_id")
//	private CustomerDetails customerId;
	
	private int customerId;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="mechanic_id")
//	private Employee mechanic;
	
	private int employeeAsMechanic;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="vehicle_id")
//	private VehicleDetails vehicleId;
	
	private int vehicleId;
	
	@Column(name="current_km")
	private int currentKm;
	
	@Column(name="service_category")
	private String serviceCategory;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private ServiceStatus roServiceStatus;
	
	private int statusId;
	
	@Temporal(TemporalType.DATE)
	@JoinColumn(name="ro_created_date")
	private Date roCreatedDate;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="ro_created_by_employee_executive")
//	private Employee roCreatedByEmployeeExecutive;
	
	private int employeeAsExecutive;

	public int getRoServiceId() {
		return roServiceId;
	}

	public void setRoServiceId(int roServiceId) {
		this.roServiceId = roServiceId;
	}

	public Set<ServiceType> getServiceType() {
		return serviceType;
	}

	public void setServiceType(Set<ServiceType> serviceType) {
		this.serviceType = serviceType;
	}

	public int getServiceRepairQuantity() {
		return serviceRepairQuantity;
	}

	public void setServiceRepairQuantity(int serviceRepairQuantity) {
		this.serviceRepairQuantity = serviceRepairQuantity;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getPromisedDate() {
		return promisedDate;
	}

	public void setPromisedDate(Date promisedDate) {
		this.promisedDate = promisedDate;
	}

	public Date getPromisedTime() {
		return promisedTime;
	}

	public void setPromisedTime(Date promisedTime) {
		this.promisedTime = promisedTime;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getEmployeeAsMechanic() {
		return employeeAsMechanic;
	}

	public void setEmployeeAsMechanic(int employeeAsMechanic) {
		this.employeeAsMechanic = employeeAsMechanic;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getCurrentKm() {
		return currentKm;
	}

	public void setCurrentKm(int currentKm) {
		this.currentKm = currentKm;
	}

	public String getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Date getRoCreatedDate() {
		return roCreatedDate;
	}

	public void setRoCreatedDate(Date roCreatedDate) {
		this.roCreatedDate = roCreatedDate;
	}

	public int getEmployeeAsExecutive() {
		return employeeAsExecutive;
	}

	public void setEmployeeAsExecutive(int employeeAsExecutive) {
		this.employeeAsExecutive = employeeAsExecutive;
	}
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "roServiceId")
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	//@JoinColumn(name="parts_details")
//	private Set<ROPartsDetails>  partsDetails;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	private ROLabourDetails labourDetails;

	

}