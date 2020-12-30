package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
@Entity
@Table(name="ro_partdetails")
public class ROPartsDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="parts_id")
	private int partsId;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="product_id")
//	private Product productId;

	private int productId;
	
	@Column(name="quantity")
	private int quantity; 
	
	@Column(name="product_price_excludingGST")
	private double productPriceExcludingGST;
	
	@Column(name="product_price_includingGST")
	private double productPriceIncludingGST;
	
	@Column(name="total_price")
	private double totalPrice;

	public int getPartsId() {
		return partsId;
	}

	public void setPartsId(int partsId) {
		this.partsId = partsId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getProductPriceExcludingGST() {
		return productPriceExcludingGST;
	}

	public void setProductPriceExcludingGST(double productPriceExcludingGST) {
		this.productPriceExcludingGST = productPriceExcludingGST;
	}

	public double getProductPriceIncludingGST() {
		return productPriceIncludingGST;
	}

	public void setProductPriceIncludingGST(double productPriceIncludingGST) {
		this.productPriceIncludingGST = productPriceIncludingGST;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private ROService roServiceId;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private InvoiceTable invoiceTable;

	
}
