package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ServiceStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	
	private String statusName;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "empStatus")
	private Employee employee;
	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "roServiceStatus")
//	private ROService roservice;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GSTSlab gstslab;
}
