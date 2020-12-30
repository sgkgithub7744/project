package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class GSTSlab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gstId;

	private double gstPer;

	private String gstDesc;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "gstslab")
	@JoinColumn(name = "gstStatus")
	private ServiceStatus gststatus;

	@OneToOne(cascade = CascadeType.ALL)
	private Product product;

	public int getGstId() {
		return gstId;
	}

	public void setGstId(int gstId) {
		this.gstId = gstId;
	}

	public double getGstPer() {
		return gstPer;
	}

	public void setGstPer(double gstPer) {
		this.gstPer = gstPer;
	}

	public String getGstDesc() {
		return gstDesc;
	}

	public void setGstDesc(String gstDesc) {
		this.gstDesc = gstDesc;
	}

	public ServiceStatus getGststatus() {
		return gststatus;
	}

	public void setGststatus(ServiceStatus gststatus) {
		this.gststatus = gststatus;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}