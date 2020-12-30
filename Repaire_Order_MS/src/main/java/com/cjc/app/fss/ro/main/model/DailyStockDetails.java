package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DailyStockDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dailStockId;
	private String productName;
	private String productDescription;
	private String receivedStockData;//in future we have to take it as "date" type
	private int stockIn;
	private int stockOut;
	private int productQuantity;
	private double productCost;
	
}
