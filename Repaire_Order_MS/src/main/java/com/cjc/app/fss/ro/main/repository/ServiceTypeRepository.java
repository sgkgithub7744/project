package com.cjc.app.fss.ro.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.ServiceType;
@Repository
public interface ServiceTypeRepository extends CrudRepository<ServiceType, Integer>{

}
