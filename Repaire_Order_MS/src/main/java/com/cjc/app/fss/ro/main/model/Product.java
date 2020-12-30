package com.cjc.app.fss.ro.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	private String productName;
	
	private String productType;
	
	private String productHsn;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="pro_mfg_date")
	private Date productManDate;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="pro_exp_date")
	private Date productExpDate;
	
	private double productCostExcGST;
	
	private double productCostIncGST;
	
	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "productId")
//	  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	//@Column(name="parts_id")
//	private ROPartsDetails partsDetails;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
	  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	//@Column(name="gstslab_id")
	private GSTSlab gstslab;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "product")
	  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	//@Column(name="model_id")
	private Model model;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductHsn() {
		return productHsn;
	}

	public void setProductHsn(String productHsn) {
		this.productHsn = productHsn;
	}

	public Date getProductManDate() {
		return productManDate;
	}

	public void setProductManDate(Date productManDate) {
		this.productManDate = productManDate;
	}

	public Date getProductExpDate() {
		return productExpDate;
	}

	public void setProductExpDate(Date productExpDate) {
		this.productExpDate = productExpDate;
	}

	public double getProductCostExcGST() {
		return productCostExcGST;
	}

	public void setProductCostExcGST(double productCostExcGST) {
		this.productCostExcGST = productCostExcGST;
	}

	public double getProductCostIncGST() {
		return productCostIncGST;
	}

	public void setProductCostIncGST(double productCostIncGST) {
		this.productCostIncGST = productCostIncGST;
	}

//	public ROPartsDetails getPartsDetails() {
//		return partsDetails;
//	}
//
//	public void setPartsDetails(ROPartsDetails partsDetails) {
//		this.partsDetails = partsDetails;
//	}

	public GSTSlab getGstslab() {
		return gstslab;
	}

	public void setGstslab(GSTSlab gstslab) {
		this.gstslab = gstslab;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
}
