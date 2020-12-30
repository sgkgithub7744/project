package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ro_labourdetails")
public class ROLabourDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ro_labour_id")
	private int roLabourId;
	
	@Column(name="Labour_price_excluding_GST")
	private double labourPriceExcludingGST;
	
	@Column(name="Labour_price_including_GST")
	private double labourPriceIncludingGST;
	
	@Column(name="total_price")
	private double totalPrice;
	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "labourDetails")
//	@JoinColumn(name="ro_service_id")
//	private ROService roService;
	
//	@OneToOne(cascade = CascadeType.ALL,mappedBy = "labourId")
//	private InvoiceTable invoiceTable;

	private int employeeId;

	public int getRoLabourId() {
		return roLabourId;
	}

	public void setRoLabourId(int roLabourId) {
		this.roLabourId = roLabourId;
	}

	public double getLabourPriceExcludingGST() {
		return labourPriceExcludingGST;
	}

	public void setLabourPriceExcludingGST(double labourPriceExcludingGST) {
		this.labourPriceExcludingGST = labourPriceExcludingGST;
	}

	public double getLabourPriceIncludingGST() {
		return labourPriceIncludingGST;
	}

	public void setLabourPriceIncludingGST(double labourPriceIncludingGST) {
		this.labourPriceIncludingGST = labourPriceIncludingGST;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

//	public ROService getRoService() {
//		return roService;
//	}
//
//	public void setRoService(ROService roService) {
//		this.roService = roService;
//	}

//	public InvoiceTable getInvoiceTable() {
//		return invoiceTable;
//	}
//
//	public void setInvoiceTable(InvoiceTable invoiceTable) {
//		this.invoiceTable = invoiceTable;
//	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	
}
