package com.cjc.app.fss.ro.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.ro.main.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	

	public Product findByProductId(int productId);

}
