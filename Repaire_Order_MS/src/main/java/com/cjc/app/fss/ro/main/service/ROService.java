package com.cjc.app.fss.ro.main.service;

import java.util.List;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.DailyStockDetails;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.Product;
import com.cjc.app.fss.ro.main.model.ROLabourDetails;
import com.cjc.app.fss.ro.main.model.ServiceType;
import com.cjc.app.fss.ro.main.model.VehicleDetails;

public interface ROService {

	public void saveCustomerData(CustomerDetails c);

	public void saveVehicleData(VehicleDetails v);

	public void saveVehicleAndCustomerData(VehicleDetails v);

	public VehicleDetails getVehicleAndCustomerDetailsByVIN(String VIN);

	public VehicleDetails getcustomerandvehicledetailsusingregistrationnumber(String RN);

	public int getcustomerIDusingmobileno(long MN);

	public VehicleDetails getVehicleDetailsUsingCustomerID(int cid);

	public List<ServiceType> getAllServiceType();

	public List<Product> getAllProductDetails();
	
	public List<ROLabourDetails> getAllLabourDetails();

	public List<DailyStockDetails> getStockDetailsByProductId(int productid);

	public List<InvoiceTable> getInvoiceDetailsByRONumber(String ron);

	public VehicleDetails getVehicleDetailsByVehicelId(int vehicleId);

	public String getProductNameByProductId(int productId);

	public void saveInvoiceDetails(List<InvoiceTable> listofinvoice);

	public InvoiceTable getInvoiceDetailByInvoiceNo(String invoiceNo);

}
