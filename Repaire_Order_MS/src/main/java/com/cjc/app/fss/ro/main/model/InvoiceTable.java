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

@Entity
@Table(name="invoice_table")
public class InvoiceTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="invoice_id")
	private int invoiceId;
	
	@Column(name="invoice_no")
	private String invoiceNo;
	
	public Set<ROPartsDetails> getRoPartDetails() {
		return roPartDetails;
	}

	public void setRoPartDetails(Set<ROPartsDetails> roPartDetails) {
		this.roPartDetails = roPartDetails;
	}

	public ROLabourDetails getRoLabourChargesDetails() {
		return roLabourChargesDetails;
	}

	public void setRoLabourChargesDetails(ROLabourDetails roLabourChargesDetails) {
		this.roLabourChargesDetails = roLabourChargesDetails;
	}

	@OneToMany(cascade = CascadeType.ALL)
	private Set<ROPartsDetails>roPartDetails=new HashSet<ROPartsDetails>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="labour_id")
	private ROLabourDetails roLabourChargesDetails;
	
	@Temporal(TemporalType.DATE)
	@Column(name="pre_invoice_gen_date")
	private Date preInvoiceGenerationDate;
	
	@Column(name="total_pre_invoice_price")
	private double totalPreInvoicePrice;
	
	@Temporal(TemporalType.DATE)
	@Column(name="invoice_gen_date")
	private Date invoiceGenerationDate;
	
	@Column(name="total_paid_amt")
	private double totalPaidAmount;
	
	@Column(name="gate_pass_gen_status")
	private String gatePassGenerationStatus;

	@OneToOne(cascade = CascadeType.ALL)
	private ROService roService;

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	

//	public ROLabourDetails getLabourChargesDetails() {
//		return labourChargesDetails;
//	}
//
//	public void setLabourChargesDetails(ROLabourDetails labourChargesDetails) {
//		this.labourChargesDetails = labourChargesDetails;
//	}

	public Date getPreInvoiceGenerationDate() {
		return preInvoiceGenerationDate;
	}

	public void setPreInvoiceGenerationDate(Date preInvoiceGenerationDate) {
		this.preInvoiceGenerationDate = preInvoiceGenerationDate;
	}

	public double getTotalPreInvoicePrice() {
		return totalPreInvoicePrice;
	}

	public void setTotalPreInvoicePrice(double totalPreInvoicePrice) {
		this.totalPreInvoicePrice = totalPreInvoicePrice;
	}

	public Date getInvoiceGenerationDate() {
		return invoiceGenerationDate;
	}

	public void setInvoiceGenerationDate(Date invoiceGenerationDate) {
		this.invoiceGenerationDate = invoiceGenerationDate;
	}

	public double getTotalPaidAmount() {
		return totalPaidAmount;
	}

	public void setTotalPaidAmount(double totalPaidAmount) {
		this.totalPaidAmount = totalPaidAmount;
	}

	public String getGatePassGenerationStatus() {
		return gatePassGenerationStatus;
	}

	public void setGatePassGenerationStatus(String gatePassGenerationStatus) {
		this.gatePassGenerationStatus = gatePassGenerationStatus;
	}

	public ROService getRoService() {
		return roService;
	}

	public void setRoService(ROService roService) {
		this.roService = roService;
	}
}
