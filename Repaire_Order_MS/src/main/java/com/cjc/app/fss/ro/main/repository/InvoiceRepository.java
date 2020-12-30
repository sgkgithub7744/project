package com.cjc.app.fss.ro.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.InvoiceTable;

@Repository
public interface InvoiceRepository extends CrudRepository<InvoiceTable, Integer>{

	InvoiceTable findByInvoiceNo(String invoiceNo);

	//List<InvoiceTable> findByRoNumber(String ron);

}
