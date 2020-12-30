package com.cjc.app.fss.ro.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.DailyStockDetails;
import com.cjc.app.fss.ro.main.model.InvoiceTable;
import com.cjc.app.fss.ro.main.model.Product;
import com.cjc.app.fss.ro.main.model.ROLabourDetails;
import com.cjc.app.fss.ro.main.model.ROPartsDetails;
import com.cjc.app.fss.ro.main.model.ServiceType;
import com.cjc.app.fss.ro.main.model.VehicleDetails;
import com.cjc.app.fss.ro.main.service.ROService;
import com.netflix.discovery.converters.Auto;

@RestController
@CrossOrigin("*")
public class ROController {

	@Autowired
	ROService rs;
	
	@PostMapping("/postcustomerdata")
	public String saveCustomerData(@RequestBody CustomerDetails c) {
		rs.saveCustomerData(c);
		return "Customer details saved successfully";
	}
	@PostMapping("/postvehicledata")
	public String saveVehicleData(@RequestBody VehicleDetails v) {
		rs.saveVehicleData(v);
		return "Vehicle details save successfully";
	}
	@PostMapping("/postvehicleandcustdata")
	public String saveVehicleandCustomerData(@RequestBody VehicleDetails v) {
		rs.saveVehicleAndCustomerData(v);
		return "Vehicle details save successfully";
	}
	@GetMapping("/getcustandvehdatabyVIN/{VIN}")
	public VehicleDetails getCustomerAndVehicleDetailsUsingVinNumber(@PathVariable String VIN) {
		System.out.println("by vin");
		VehicleDetails v=rs.getVehicleAndCustomerDetailsByVIN(VIN);
		return v;
	}
	@GetMapping("/getcustomerandvehicledetailsusingregistrationnumber/{RN}")
	public VehicleDetails getcustomerandvehicledetailsusingregistrationnumber(@PathVariable String RN) {
		System.out.println("by rn");
		VehicleDetails v=rs.getcustomerandvehicledetailsusingregistrationnumber(RN);
		return v;
	}
	@GetMapping("/getcustomerIDusingmobileno/{MN}")
	public int getcustomerIDusingmobileno(@PathVariable long MN) {
		System.out.println("by mn");
		int cid=rs.getcustomerIDusingmobileno(MN);
		return cid;
	}
	@GetMapping("/getVehicleDetailsUsingCustomerID/{cid}")
	public VehicleDetails getVehicleDetailsUsingCustomerID(@PathVariable int cid) {
		VehicleDetails v=rs.getVehicleDetailsUsingCustomerID(cid);
		return v;
	}
	@GetMapping("/getAllServiceType")
	public List<ServiceType> getAllServiceType(){
		List<ServiceType>Lsertype=rs.getAllServiceType();
		return Lsertype;
	}
	@GetMapping("/getAllProductDetails")
	public List<Product> getAllProductDetails(){
		List<Product> lprod=rs.getAllProductDetails();
		return lprod;
	}
	@GetMapping("/getAllLabourDetails")
	public List<ROLabourDetails> getAllLabourDetails(){
		List<ROLabourDetails> labourlist=rs.getAllLabourDetails();
		return labourlist;
	}
	@GetMapping("/getStockDetailsByProductId/{productid}")
	public List<DailyStockDetails> getStockDetailsByProductId(@PathVariable int productid){
		List<DailyStockDetails> liststock=rs.getStockDetailsByProductId(productid);
		return liststock;
	}
	@GetMapping("/getInvoiceDetailsByRONumber/{ron}")
	public List<InvoiceTable> getInvoiceDetailsByRONumber(@PathVariable String ron){
		List<InvoiceTable> InvoiceList=rs.getInvoiceDetailsByRONumber(ron);
		return InvoiceList;
	}
	@GetMapping("/getVehicleDetailsByVehicelId/{vehicleId}")
	public VehicleDetails getVehicleDetailsByVehicelId(@PathVariable int vehicleId) {
		VehicleDetails v=rs.getVehicleDetailsByVehicelId(vehicleId);
		return v;
	}
	@GetMapping("/getProductNameByProductId/{productId}")
	public String getProductNameByProductId(@PathVariable("productId") int productId) {
		String prodname=rs.getProductNameByProductId(productId);
		return prodname;
	}
	@PostMapping("/addInvoiceDetails")
	public String saveInvoiceDetails(@RequestBody List<InvoiceTable> listofinvoice) {
		rs.saveInvoiceDetails(listofinvoice);
		return "Data saved successfully";
	}
	@GetMapping("/getInvoiceDetailByInvoiceNo/{invoiceNo}")
	public InvoiceTable getInvoiceDetailByInvoiceNo(@PathVariable String invoiceNo) {
		InvoiceTable invoicedata=rs.getInvoiceDetailByInvoiceNo(invoiceNo);
		return invoicedata;
	}
}
