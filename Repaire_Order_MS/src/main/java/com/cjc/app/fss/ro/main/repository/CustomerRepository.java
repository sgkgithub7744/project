package com.cjc.app.fss.ro.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.CustomerDetails;
import com.cjc.app.fss.ro.main.model.ROService;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerDetails, Integer> {

	CustomerDetails findBycustomerMobileNumber(long MN);

}
