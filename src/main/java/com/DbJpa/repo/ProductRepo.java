package com.DbJpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.DbJpa.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{

	
}
