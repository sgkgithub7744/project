package com.cjc.app.fss.ro.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.DailyStockDetails;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.Product;
import com.cjc.app.fss.ro.main.model.ROLabourDetails;
import com.cjc.app.fss.ro.main.model.ServiceType;
import com.cjc.app.fss.ro.main.model.VehicleDetails;
import com.cjc.app.fss.ro.main.repository.CustomerRepository;
import com.cjc.app.fss.ro.main.repository.InvoiceRepository;
import com.cjc.app.fss.ro.main.repository.LabourRepository;
import com.cjc.app.fss.ro.main.repository.ProductRepository;
import com.cjc.app.fss.ro.main.repository.ServiceTypeRepository;
import com.cjc.app.fss.ro.main.repository.StockRepository;
import com.cjc.app.fss.ro.main.repository.VehicleReository;
import com.cjc.app.fss.ro.main.service.ROService;
@Service
public class ROServiceImpl implements ROService{

	@Autowired
	CustomerRepository cr;
	
	@Autowired
	VehicleReository vr;
	
	@Autowired
	ServiceTypeRepository sr;
	
	@Autowired
	ProductRepository pr;
	
	@Autowired
	LabourRepository lr;
	
	@Autowired
	StockRepository stock;
	
	@Autowired
	InvoiceRepository ir;
	
	@Override
	public void saveCustomerData(CustomerDetails c) {
		cr.save(c);	
	}

	@Override
	public void saveVehicleData(VehicleDetails v) {
		vr.save(v);
		
	}

	@Override
	public void saveVehicleAndCustomerData(VehicleDetails v) {
		vr.save(v);
		
	}

	@Override
	public VehicleDetails getVehicleAndCustomerDetailsByVIN(String VIN) {
		VehicleDetails v=vr.findByvehicleVIN(VIN);
		return v;
	}

	@Override
	public VehicleDetails getcustomerandvehicledetailsusingregistrationnumber(String RN) {
		VehicleDetails v=vr.findByvehicleRegistrationNumber(RN);
		return v;
	}

	@Override
	public int getcustomerIDusingmobileno(long MN) {
		CustomerDetails cust=cr.findBycustomerMobileNumber(MN);
		
		return cust.getCustomerId();
	}

	@Override
	public VehicleDetails getVehicleDetailsUsingCustomerID(int cid) {
		VehicleDetails v=vr.findBycustomerDetailsCustomerId(cid);
		return v;
	}

	@Override
	public List<ServiceType> getAllServiceType() {
		
		return (List<ServiceType>) sr.findAll();
	}

	@Override
	public List<Product> getAllProductDetails() {
		
		return (List<Product>) pr.findAll();
	}

	@Override
	public List<ROLabourDetails> getAllLabourDetails() {
		
		return (List<ROLabourDetails>) lr.findAll();
	}

	@Override
	public List<DailyStockDetails> getStockDetailsByProductId(int productid) {
		//List<DailyStockDetails> liststock=stock.findById(productid);
		return null;
	}

	@Override
	public List<InvoiceTable> getInvoiceDetailsByRONumber(String ron) {
	//	List<InvoiceTable> InvoiceList=ir.findByRoNumber(ron);
		return null;
	}

	@Override
	public VehicleDetails getVehicleDetailsByVehicelId(int vehicleId) {
		VehicleDetails v=vr.findByVehicleId(vehicleId);
		System.out.println(v.getVehicleColor());
		return v;
	}

	@Override
	public String getProductNameByProductId(int productId) {
		
		Product product=pr.findByProductId(productId);
		System.out.println(product.getProductName());
		return product.getProductName();
	}

	@Override
	public void saveInvoiceDetails(List<InvoiceTable> listofinvoice) {
		ir.saveAll(listofinvoice);
		
	}

	@Override
	public InvoiceTable getInvoiceDetailByInvoiceNo(String invoiceNo) {
		InvoiceTable invoicedata=ir.findByInvoiceNo(invoiceNo);
		return invoicedata;
	}

}
