package com.cjc.app.fss.ro.main.model;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employeeDetails")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "employeeId")
	private int employeeId;
	
	private String employeeName;
	
	private String employeeUname;

	private String employeePass;
	
	private String employeeFirstname;
	
	private String employeeLastname;
	
	private long employeeMobile;

	@Temporal(value=TemporalType.DATE)
	private Date employeeDob;
	
	private String employeeQulification;

	private String employeeGender;

	private String employeePermenantAddress;

	private String employeeLocalAddress;
	
	private String employeeEmail;
	
	@Temporal(value=TemporalType.DATE)
	private Date employeeJoinDates;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeStatusId")
	private ServiceStatus empStatus;
	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "mechanic")
//	private ROService roServiceId;
//
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "roCreatedByEmployeeExecutive")
//	private ROService roService;

}
